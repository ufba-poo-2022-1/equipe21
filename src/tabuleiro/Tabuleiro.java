package tabuleiro;

public class Tabuleiro {
	/* declaração das linhas, colunas e matriz de peças do tabuleiro*/
	private int linhas;
	private int colunas;
	private Pecas [][] pecas;
	
	/* contrutores de linhas e colunas*/
	public Tabuleiro(int linhas, int colunas) {
		if (linhas < 1 || colunas < 1) {
			//linha que informa que o método pode lancar uma exceção:
			throw new Exceção("Erro ao criar o tabuleiro: É necessaŕio que haja pelo menos 1(uma) linha e 1(uma) coluna");
		}
			
		this.linhas = linhas;
		this.colunas = colunas;
		pecas = new Pecas [linhas][colunas];//matrizes das peças instaciadas 
	}

	public int getLinhas() {
		return linhas;
	}

	/*public void setLinhas(int linhas) {
		this.linhas = linhas;
	}*/ //// não alterar qtde de linhas do tabuleiro
	
/*getters e setters de linhas e colunas. 
 * Para as peças, serão criados metodos para retornar as peças, uma por vez  */
	
	public int getColunas() {
		return colunas;
	}
/*
	public void setColunas(int colunas) {
		this.colunas = colunas;
	}*/ // não alterar qtde de colunas
	
	/*metodo para retornar uma peça na matriz de linhas e colunas*/
	public Pecas peca (int linhas, int colunas) {
		if (!existe_posicao(linhas, colunas)) {
			throw new Exceção("Não existe essa posição no tabuleiro");
		}
		return pecas [linhas][colunas];
	}
	
	/*sobrecarga do método anterior*/
	public Pecas peca (Posição posicao) {
		if (!existe_posicao(posicao)) {
			throw new Exceção("Não existe essa posição no tabuleiro");
		}
		return pecas [posicao.getLinhas()][posicao.getColunas()];
	}
	/* atribuir à matriz uma peça de acordo com uma determinada posicao */
	public void colocar_peca(Pecas peca,Posição posicao) {
		//testar se já existe uma peça na posicao:
		if (existe_peca (posicao)) {
			throw new Exceção ("Já existe uma peça na posição:" + posicao);
		}
		pecas [posicao.getLinhas()] [posicao.getColunas()] = peca;//mesma matriz que foi declarada no tabuleiro (linha 7) e instanciada no construtor(l 13)
		peca.posicao = posicao;
		/*A peca não esta mais na posicao nula e sim na posicao declarada nesse metodo.
		 * A posicao da peca é acessivel pois foi declarada como protected na classe peca e estamos usando no mesmo pacote(tabuleiro) */
	}
	//metodo auxiliar:
	private boolean existe_posicao(int linha, int coluna) {
		return linha >= 0 && linha < linhas && coluna >= 0 && coluna < colunas;//condição par  verificar se uma posicao existe
	}
	
	public boolean existe_posicao(Posição posicao) {
		return existe_posicao (posicao.getLinhas(), posicao.getColunas());
	}
	//metodo para verificar se tem uma peca em deteminada posicao
	public boolean existe_peca(Posição posicao) {
		if (!existe_posicao(posicao)) {
			throw new Exceção("Não existe essa posição no tabuleiro");
		}
		return peca(posicao) != null; 
	}
}
	
	