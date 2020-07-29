//*******************************************
//	Card.java			Author: Ben Callen
//
//	Randomly generates five cards from a deck
//*******************************************
import java.util.Random;

	public class Card {
		int suit, value;
		String cardSuit, cardValue;
		Random number = new Random();
		
		public Card() { //creates method to use to choose a card randomly
			randomizer();
		}

			public void randomizer() { //randomly chooses a suit and index value for the face value
				suit = number.nextInt(4) + 1;
				value = number.nextInt(13) + 1;
			}
	
	public String toString() { //if statements with parameters to define the values/suits of the cards
		if (value >=2 && value<=10)
			cardValue = Integer.toString(value);
		else if (value == 1)
			cardValue = "Ace";
		else if (value == 11)
			cardValue = "Jack";
		else if (value ==12)
			cardValue = "Queen";
		else
			cardValue = "King";
		if ( suit == 1)
			cardSuit = "Hearts";
		else if (suit == 2)
			cardSuit = "Diamonds";
		else if (suit == 3)
			cardSuit = "Spades";
		else
			cardSuit = "Clubs";
		
		return cardValue + cardSuit;
	}

	public static void main(String[] args) {
		int card = 0;
		Card newCard = new Card();
		
		System.out.println("Your cards are: ");
		for (int value = 1; value <=5; value++) {
			newCard.randomizer();
			System.out.println(card + ") " + newCard);
			card++;
		}
		}

	}




