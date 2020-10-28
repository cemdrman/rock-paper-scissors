package com.taskagitmakas.factory;

import com.taskagitmakas.CardType;
import com.taskagitmakas.model.Card;
import com.taskagitmakas.model.Paper;
import com.taskagitmakas.model.Rock;
import com.taskagitmakas.model.Scissor;

public class CardFactory {

	public Card getCard(CardType type) {

		if (type.equals(CardType.PAPER)) {
			return new Paper(type);
		} else if (type.equals(CardType.ROCK)) {
			return new Rock(type);
		}
		return new Scissor(type);

	}

}
