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
	/*metodo para retornar uma peça na matriz de linhas e colunas*/
	public Pecas peca (int linhas, int colunas) {
		return pecas [linhas][colunas];
	}
	
	/*sobrecarga do método anterior*/
	public Pecas peca (Posição posicao) {
		return pecas [posicao.getLinhas()][posicao.getColunas()];
	}
	/* atribuir à matriz uma peça de acordo com uma determinada posicao */
	public void colocar_peca(Pecas peca,Posição posicao) {
		pecas [posicao.getLinhas()] [posicao.getColunas()] = peca;//mesma matriz que foi declarada no tabuleiro (linha 7) e instanciada no construtor(l 13)
		peca.posicao = posicao;
		/*A peca não esta mais na posicao nula e sim na posicao declarada nesse metodo.
		 * A posicao da peca é acessivel pois foi declarada como protected na classe peca e estamos usando no mesmo pacote(tabuleiro) */
	}
}
	
	