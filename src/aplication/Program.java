package aplication;

import java.util.Scanner;

import xadrez.Partida_xadrez;
import xadrez.Peça_xadrez;
import xadrez.posicao_xadrez;

public class Program {

	public static void main(String[] args) {
		
		//teste de movimento de peças
		Scanner sc = new Scanner(System.in);
		Partida_xadrez partida_xadrez = new Partida_xadrez();
	
		while (true) {
			UI.imprimiTabuleiro(partida_xadrez.getPecas());
			System.out.println();
			System.out.print("Origem: ");
			posicao_xadrez origem = UI.lerPosicaoXadrez(sc);
			
			System.out.println();
			System.out.print("Destino: ");
			posicao_xadrez destino = UI.lerPosicaoXadrez(sc);
			
			Peça_xadrez capturaPeca = partida_xadrez.performance_mov(origem, destino);	
		}	
	}
}
