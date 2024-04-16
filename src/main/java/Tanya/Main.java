package Tanya;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}public class DeckOfCards2 {
    public static void main(String[] args) {
        int[] deck = new int[52];
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // Initialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }

        // Shuffle the cards
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
        }

        // Display the all the cards
        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println( rank + " of " + suit);
        }
    }
}public class DeckOfCards {
    private Card theCard;
    private int remainingCards = 52;

    DeckOfCards() {
        theCard = new Card();
    }

    public void shuffle(){
        for (int i = 0; i < deck.length; i++) {
            int index = (int)(Math.random() deck.length);
            int temp = deck[i];
            deck[i] = deck[index];
            deck[index] = temp;
            remainingCards--;
        }
    }

    public void deal(){
        for (int i = 0; i < 52; i++) {
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println( rank + " of " + suit);
            System.out.println("Remaining cards: " + remainingCards);
        }
    }
}
public class Card {
    int[] deck = new int[52];
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    Card() {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i;
        }
    }
}
public class Dealer {
    public static void main(String[]args){
        System.out.println("The deck will randomly print out a card from a full deck each time");

        DeckOfCards player = new DeckOfCards();
        player.deal();
    }
}