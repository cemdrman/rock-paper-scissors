package com.taskagitmakas.model;

import com.taskagitmakas.CardType;

public class Rock extends Card {

	private CardType type = CardType.ROCK;

	public Rock(CardType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(Card card) {
		if (this.type.getCardName().equals(card.getType().getCardName())) {
			System.out.println("tie!");
		} else if (card.getType().equals(CardType.PAPER)) {
			System.out.println("lost");
		} else {
			System.out.println("win");
		}

	}

}
