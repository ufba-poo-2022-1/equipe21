package tabuleiro;

public class Tabuleiro {
	/* declaração das linhas, colunas e matriz de peças do tabuleiro*/
	private int linhas;
	private int colunas;
	private Pecas [][] pecas;
	
	/* contrutores de linhas e colunas*/
	public Tabuleiro(int linhas, int colunas) {
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Pecas [linhas][colunas];//matrizes das peças instaciadas 
	}

	public int getLinhas() {
		return linhas;
	}

	public void setLinhas(int linhas) {
		this.linhas = linhas;
	}
/*getters e setters de linhas e colunas. 
 * Para as peças, serão criados metodos para retornar as peças, uma por vez  */
	
	public int getColunas() {
		return colunas;
	}

	public void setColunas(int colunas) {
		this.colunas = colunas;
	}
	
}
	
	