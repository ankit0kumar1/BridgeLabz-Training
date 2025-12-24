import java.util.Scanner;
public class DeckOfCards {
    //method to initialize the deck
    public static String[] initializeDeck(String[] suits, String[] ranks) {
        int numOfCards = suits.length * ranks.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    //method that shuffle the deck
    public static void shuffleDeck(String[] deck) {
        int n = deck.length;

        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + (int) (Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }

    //method that distribute cards to players
    public static String[][] distributeCards(String[] deck, int players, int cardsPerPlayer) {
        int totalCardsNeeded = players * cardsPerPlayer;
        if (totalCardsNeeded > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }
        String[][] playerCards = new String[players][cardsPerPlayer];
        int cardIndex = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                playerCards[i][j] = deck[cardIndex++];
            }
        }
        return playerCards;
    }
    //method that print players and their cards
    public static void printPlayers(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("player " + (i + 1) + ":");
            for (int j = 0; j < players[i].length; j++) {
                System.out.println("  " + players[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        //initialize deck
        String[] deck = initializeDeck(suits, ranks);
        //  Shuffle deck
        shuffleDeck(deck);
		//ceraet the object of scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of players: ");
        int players = input.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = input.nextInt();
        //distribute cards
        String[][] distributedCards = distributeCards(deck, players, cardsPerPlayer);

        // Print cards
        if (distributedCards != null) {
            printPlayers(distributedCards);
        }
        input.close();
		
    }
}