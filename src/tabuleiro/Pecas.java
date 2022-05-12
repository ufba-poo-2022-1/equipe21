package tabuleiro;

//classe usada para implementar as peças do tabuleiro de xadrez
public class Pecas {
	protected Posição posicao;//posição protegida, não visvel no tabuleiro
	private Tabuleiro tabul; //associação da peça com o tabuleiro e vice versa
	
	/*construtor das peças. Apenas o tabuleiro, pois a posição 
	 * inicialmente é nula, ou seja não foi colocada no tabuleiro
	 */
	public Pecas(Tabuleiro tabul) {
		this.tabul = tabul;
		posicao = null;
	}
/*não tem set pois não queremos  que o tabuleiro seja alterado*/
/*O get do tabuleiro está como protegido pois somente classes e subclasses 
 * do mesmo pacote podem acessar o tabuleiro de uma peça
 */
	protected Tabuleiro getTabul() {
		return tabul;
	}

	
	

}
