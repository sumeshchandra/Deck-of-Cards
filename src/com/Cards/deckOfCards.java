package com.Cards;

import java.util.HashSet;
import java.util.Set;

public class deckOfCards {

	/**
	 * Setup the initial game with deck of cards 
	 * and make sure we have unique cards, 
	 * The number of cards are 52.
	 */
	public static void main(String[] args) {
		System.out.print("Welcome to Card of deck");
		deckOfCards();
	}

	// constructor
	public static void deckOfCards() {

		String[] suits = { "Clubs", "Diamonds", "hearts", "Spades" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		
		String arrayCard[][] = new String[4][13];
		Set<String> cards = new HashSet<String>();

		// Create combination of cards
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				arrayCard[i][j] = suits[i] + ranks[j];

			}
		}
	}
}











