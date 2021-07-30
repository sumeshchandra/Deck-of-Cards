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
//		Set<String> cards = new HashSet<String>();

		// Create combination of cards
		int n = suits.length * ranks.length;
		String[] deck = new String[n];
		for (int i = 0; i < ranks.length; i++) {
			for (int j = 0; j < suits.length; j++) {
				deck[suits.length * i + j] = ranks[i] + " " + suits[j];

			}
		}
	}
}











