package exercise1;

/**
 * A class that fills a hand of 7 cards with random Card Objects and then asks the user to pick a card.
 * It then searches the array of cards for the match to the user's card. 
 * To be used as starting code in Exercise
 *
 * @author dancye
 * @author Paul Bonenfant Jan 25, 2022 
 */
import java.util.Random;
import java.util.Scanner;
public class CardTrick {
    
    public static void main(String[] args) {
        
        Card[] hand = new Card[7];

        for (int i = 0; i < hand.length; i++) {
            Card card = new Card();
            //card.setValue(insert call to random number generator here)
            // 
            //card.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            // Hint: You can use Random -> random.nextInt(n) to get a random number between 0 and n-1 (inclusive)
            //       Don't worry about duplicates at this point
        }
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your card value (1-10, 11 for Jack, 12 for Queen, 13 for King): ");
        int value = scanner.nextInt();

        System.out.print("Enter your card suit (1 for Hearts, 2 for Diamonds, 3 for Clubs, 4 for Spades): ");
        int suitIndex = scanner.nextInt() - 1;
        String suit = Card.SUITS[suitIndex];

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);
        
        boolean foundMatch = false;

        for (Card card : hand) {
        if (card.getValue() == userCard.getValue() && card.getSuit().equals(userCard.getSuit())) {
        foundMatch = true;
        break;
    }
    }

        if (foundMatch) {
        printInfo();
    }


        // insert code to ask the user for Card value and suit, create their card
        // and search the hand here. 
        // Hint: You can ask for values 1 to 10, and then
        //       11 for jack, 12 for queen, etc. (remember arrays are 0-based though)
        //       1 for Hearts, 2 for Diamonds, etc. (remember arrays are 0-based though)
        // 
        // Then loop through the cards in the array to see if there's a match.
        
        // If the guess is successful, invoke the printInfo() method below.
        
    }

    /**
     * A simple method to print out personal information. Follow the instructions to 
     * @author Wanqin Liang June 04,2023
     */
    // I have done and been ready to push.
    private static void printInfo() {
    
        System.out.println("Congratulations, you guessed right!");
        System.out.println();
        
        System.out.println("My name is Paul, but you can call me prof, Paul or sir");
        System.out.println();
        
        System.out.println("My career ambitions:");
        System.out.println("-- Be more active on LinkedIn");
        System.out.println("-- Have a semester with no violations of academic integrity!");
	System.out.println();	

        System.out.println("My hobbies:");
        System.out.println("-- Investing");
        System.out.println("-- Cooking");
        System.out.println("-- Reading/Watching TV");
        System.out.println("-- Riding my motorcycle");

        System.out.println();
        
    
    }

}
