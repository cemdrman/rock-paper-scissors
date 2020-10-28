package com.taskagitmakas.model;

import com.taskagitmakas.CardType;

public class Scissor extends Card {
	
	private CardType type = CardType.SCISSOR;

	public Scissor(CardType type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void handle(Card card) {
		if (this.type.getCardName().equals(card.getType().getCardName())) {
			System.out.println("tie!");
		} else if (card.getType().equals(CardType.ROCK)) {
			System.out.println("lost");
		} else {
			System.out.println("win");
		}

	}

}
