// Write a program to create, shuffle, distribute a deck of cards and print players' cards


import java.util.Scanner;

public class DeckOfCards {

    // initialize the deck with suits and ranks
	
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        // create cards 
		
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck; // return initialized deck
    }

    // shuffle the deck of cards
	
    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;

        // loop through deck and swap each card with a random card
		
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i)); // random index
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }

        return deck; // return shuffled deck
    }

    // distribute n cards to x players
	
    public static String[][] distributeCards(String[] deck, int n, int x) {
        if (n > deck.length || n % x != 0) {
            System.out.println("Cannot distribute " + n + " cards to " + x + " players evenly.");
            return null;
        }

        int cardsPerPlayer = n / x;
        String[][] players = new String[x][cardsPerPlayer];

        // assign cards to players
		
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[i * cardsPerPlayer + j];
            }
        }

        return players; 
    }

    // print the players and their cards
	
    public static void printPlayersCards(String[][] players) {
        if (players == null) return;

        // loop through players and print their cards
		
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println(players[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // define suits and ranks
		
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        // initialize the deck
		
        String[] deck = initializeDeck(suits, ranks);

        // shuffle the deck
		
        deck = shuffleDeck(deck);

        // ask user to enter number of cards and players
		
        System.out.print("Enter number of cards to distribute: ");
        int n = sc.nextInt();

        System.out.print("Enter number of players: ");
        int x = sc.nextInt();

        // distribute the cards
		
        String[][] players = distributeCards(deck, n, x);

        // print the players and their cards
		
        printPlayersCards(players);

        sc.close(); // close scanner
    }
}
