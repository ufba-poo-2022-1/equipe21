package aplication;

import xadrez.Partida_xadrez;

public class Program {

	public static void main(String[] args) {
		Partida_xadrez partida_xadrez = new Partida_xadrez();
		
		UI.imprimiTabuleiro(partida_xadrez.getPecas());

	}

}
