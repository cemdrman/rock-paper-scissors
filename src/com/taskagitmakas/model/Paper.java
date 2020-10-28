package com.taskagitmakas.model;

import com.taskagitmakas.CardType;

public class Paper extends Card {

	private CardType type = CardType.PAPER;

	public Paper(CardType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void handle(Card card) {
		if (this.type.getCardName().equals(card.getType().getCardName())) {
			System.out.println("tie!");
		} else if (card.getType().equals(CardType.SCISSOR)) {
			System.out.println("lost");
		} else {
			System.out.println("win");
		}

	}

}
