package com.taskagitmakas;

public enum CardType {

	ROCK("Rock"), PAPER("Paper"), SCISSOR("Scissor");

	private String cardName;

	private CardType(String cardName) {
		this.cardName = cardName;
	}

	public String getCardName() {
		return cardName;
	}

}
