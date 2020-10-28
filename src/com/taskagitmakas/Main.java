package com.taskagitmakas;

import com.taskagitmakas.factory.CardFactory;
import com.taskagitmakas.model.Paper;
import com.taskagitmakas.model.Rock;
import com.taskagitmakas.model.Scissor;

public class Main {
	public static void main(String[] args) {

		CardFactory cardFactory = new CardFactory();

		Paper paper = (Paper) cardFactory.getCard(CardType.PAPER);
		Rock rock = (Rock) cardFactory.getCard(CardType.ROCK);
		Scissor scissor = (Scissor) cardFactory.getCard(CardType.SCISSOR);

		paper.handle(rock);
		scissor.handle(rock);
		rock.handle(rock);
	}

}
