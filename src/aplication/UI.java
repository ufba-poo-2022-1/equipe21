package aplication;

import xadrez.Peça_xadrez;
/*classe usada para imprimir o tabuleiro - UI = user interface*/
public class UI {
	public static void imprimiTabuleiro(Peça_xadrez[][]pecas) {
		for (int i=0;  i<pecas.length; i++) {
			System.out.print((8 - i) + " ");
			for (int j=0; j<pecas.length; j++) {
				imprimiPeca(pecas[i][j]);
			}
			System.out.println();
		}
		System.out.println("  a b c d e f g h");
		
	}
	
	private static void imprimiPeca(Peça_xadrez peca) {
		if (peca == null) {
			System.out.print("-");
		}
			else {
				System.out.print(peca);
			}
			System.out.print(" ");	
	}	

}
