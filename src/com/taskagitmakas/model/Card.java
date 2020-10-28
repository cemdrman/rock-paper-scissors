package com.taskagitmakas.model;

import com.taskagitmakas.CardType;
import com.taskagitmakas.Handler;

public abstract class Card implements Handler {

	private CardType type;

	public Card(CardType type) {
		this.type = type;
	}

	public CardType getType() {
		return type;
	}

}
