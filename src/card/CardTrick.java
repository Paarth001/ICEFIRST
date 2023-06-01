/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;
// EDITED BY PAARTH KUMAR SHARMA _991684990
/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 */
public class CardTrick {

    public static void main(String[] args) {
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue(generateRandomNumber()); // Set a random value for the card
            c.setSuit(Card.SUITS[generateRandomNumber(0, 3)]); // Set a random suit for the card
            magicHand[i] = c;
        }

        // Ask the user for Card value and suit, create their card
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter card value (1-13): ");
        int value = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter card suit (Hearts, Diamonds, Clubs, Spades): ");
        String suit = scanner.nextLine();
        scanner.close();

        Card userCard = new Card();
        userCard.setValue(value);
        userCard.setSuit(suit);

        // Search magicHand for the user's card
        boolean found = false;
        for (Card card : magicHand) {
            if (card.equals(userCard)) {
                found = true;
                break;
            }
        }

        // Report the result
        if (found) {
            System.out.println("Your card is in the magic hand!");
        } else {
            System.out.println("Your card is not in the magic hand.");
        }
    }

    // Helper method to generate a random number between 0 and 3
    private static int generateRandomNumber() {
        return (int) (Math.random() * 4);
    }

    // Helper method to generate a random number within a specified range
    private static int generateRandomNumber(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }
    public static void main(String[] args) {
        // Create the luckyCard object with a card number and suit of your choice
        Card luckyCard = new Card();
        luckyCard.setValue(7); // Set the card number
        luckyCard.setSuit("Spades"); // Set the card suit

        // Rest of the code...
    }
    
}
