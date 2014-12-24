/**
 * This is the main class I will use for my deck(s)
 * I should be able to call as many decks. Future versions
 * will include shuffling.
 */
package com.jacameron.texasholdem.utility;

/**
 * @author Jonathan Cameron
 *
 */
public class Cards 
{
	final int NUM_OF_DECK = 10;				//total # of decks
	final int NUM_OF_SUIT = 4;				//total # of suits
	
	//main numerical deck
	int[] deck;				//0 = "Ace"
							//1 = "King"
							//2 = "Queen"
							//3 = "Jack"
							//4 = "Ten"
							//5 = "Nine"
							//6 = "Eight"
							//7 = "Seven"
							//8 = "Six"
							//9 = "Five"
							//10 = "Four"
							//11 = "Three"
							//12 = "Two"
	
	int[] suit;				//0 = "Diamond"
							//1 = "Heart"
							//2 = "Club"
							//3 = "Spade"
	
	//Cards - Strings
	String cardAce 			= "Ace";
	String cardKing 		= "King";
	String cardQueen 		= "Queen";
	String cardJack 		= "Jack";
	String cardTen 			= "Ten";
	String cardNine 		= "Nine";
	String cardEight 		= "Eight";
	String cardSeven		= "Seven";
	String cardSix			= "Six";
	String cardFive			= "Five";
	String cardFour			= "Four";
	String cardThree		= "Three";
	String cardTwo			= "Two";
	String cardJoker		= "Joker";
	
	//Suits - Strings
	String suitDiamond = "Diamond";
	String suitHeart   = "Heart";
	String suitClub	   = "Club";
	String suitSpade   = "Spade";
	
	//Getters and Setters
	public int[] getDeck() {
		return deck;
	}
	public void setDeck(int[] deck) {
		this.deck = deck;
	}
	public int[] getSuit() {
		return suit;
	}
	public void setSuit(int[] suit) {
		this.suit = suit;
	}
	public String getCardAce() {
		return cardAce;
	}
	public void setCardAce(String cardAce) {
		this.cardAce = cardAce;
	}
	public String getCardKing() {
		return cardKing;
	}
	public void setCardKing(String cardKing) {
		this.cardKing = cardKing;
	}
	public String getCardQueen() {
		return cardQueen;
	}
	public void setCardQueen(String cardQueen) {
		this.cardQueen = cardQueen;
	}
	public String getCardJack() {
		return cardJack;
	}
	public void setCardJack(String cardJack) {
		this.cardJack = cardJack;
	}
	public String getCardTen() {
		return cardTen;
	}
	public void setCardTen(String cardTen) {
		this.cardTen = cardTen;
	}
	public String getCardNine() {
		return cardNine;
	}
	public void setCardNine(String cardNine) {
		this.cardNine = cardNine;
	}
	public String getCardEight() {
		return cardEight;
	}
	public void setCardEight(String cardEight) {
		this.cardEight = cardEight;
	}
	public String getCardSeven() {
		return cardSeven;
	}
	public void setCardSeven(String cardSeven) {
		this.cardSeven = cardSeven;
	}
	public String getCardSix() {
		return cardSix;
	}
	public void setCardSix(String cardSix) {
		this.cardSix = cardSix;
	}
	public String getCardFive() {
		return cardFive;
	}
	public void setCardFive(String cardFive) {
		this.cardFive = cardFive;
	}
	public String getCardFour() {
		return cardFour;
	}
	public void setCardFour(String cardFour) {
		this.cardFour = cardFour;
	}
	public String getCardThree() {
		return cardThree;
	}
	public void setCardThree(String cardThree) {
		this.cardThree = cardThree;
	}
	public String getCardTwo() {
		return cardTwo;
	}
	public void setCardTwo(String cardTwo) {
		this.cardTwo = cardTwo;
	}
	public String getCardJoker() {
		return cardJoker;
	}
	public void setCardJoker(String cardJoker) {
		this.cardJoker = cardJoker;
	}
	public String getSuitDiamond() {
		return suitDiamond;
	}
	public void setSuitDiamond(String suitDiamond) {
		this.suitDiamond = suitDiamond;
	}
	public String getSuitHeart() {
		return suitHeart;
	}
	public void setSuitHeart(String suitHeart) {
		this.suitHeart = suitHeart;
	}
	public String getSuitClub() {
		return suitClub;
	}
	public void setSuitClub(String suitClub) {
		this.suitClub = suitClub;
	}
	public String getSuitSpade() {
		return suitSpade;
	}
	public void setSuitSpade(String suitSpade) {
		this.suitSpade = suitSpade;
	}
	public int getNUM_OF_DECK() {
		return NUM_OF_DECK;
	}
	public int getNUM_OF_SUIT() {
		return NUM_OF_SUIT;
	}
	
	
}
