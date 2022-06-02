package xadrez;

import tabuleiro.Pecas;
import tabuleiro.Posição;
import tabuleiro.Tabuleiro;
import xadrez.pecas.Rei;
import xadrez.pecas.Torre;

/* classe onde contem as regras do jogo*/
public class Partida_xadrez {
	private Tabuleiro tabul;
	
	public Partida_xadrez() {
		tabul = new Tabuleiro(8,8);//criação da dimensao do tabuleiro
		iniciarPartida();//chamando a inicialização da partida
		}
	/*O método abaixo retorna uma matriz de pecas de xadrez correspondente 
	 * a uma partida
	 */
	public Peça_xadrez[][] getPecas(){
		/* matriz com variavel auxliar criada para que o programa enxerque apenas as peças
		 * que estão na camada de xadrez e não as peças que estão na camada tabuleiro
		 */
		Peça_xadrez[][] matriz = new Peça_xadrez[tabul.getLinhas()][tabul.getColunas()];
		/* for para percorrer a matriz de peças do tabuleiro */
				for (int i=0; i<tabul.getLinhas(); i++) {//for para percorrer as linhas
					for (int j=0; j<tabul.getColunas(); j++) {//for para percorrer as colunas
						matriz[i][j] = (Peça_xadrez) tabul.peca(i,j);
					}
				}	
				return matriz;
	}
	//metodo para mover peça de origem para destino
	public Peça_xadrez performance_mov(posicao_xadrez posicaoOrigem, posicao_xadrez posicaoDestino) {
		//convertendo as posições do xadrez para posição da matriz
		Posição origem = posicaoOrigem.convert_posic();
		Posição destino = posicaoDestino.convert_posic();
		//validando posição de origem(ver se realmente há peça nessa posição)
		validarPosicaoOrigem(origem);
		//variavel que recebe o resultado do movimento:
		Pecas capturaPeca = operacaoMovimentoPeca(origem, destino);
		return (Peça_xadrez)capturaPeca;
	}
	
	//operaçao de movimento da peça:
	private Pecas operacaoMovimentoPeca(Posição origem, Posição destino) {
		Pecas p = tabul.remover_Peca(origem);//retirando peça que estava na posicao de origem /peça = variavel p
		Pecas capturaPeca = tabul.remover_Peca(destino);//remover possivel peça que esteja no destino. a peça se torna peça capturada
		tabul.colocar_peca(p, destino);//colocando a peça retirada da origem apra posicao de destino
		return capturaPeca;
	}
	
	//implementação da operaçao de validação:
	private void validarPosicaoOrigem (Posição posicao) {
		if (!tabul.existe_peca(posicao)) {
			throw new Exceção_xad ("Não existe peça na posição de origem!");
		}
	}
	
	
	//metodo que recebe as coordenadas do xadrez:
	private void nova_peca(char coluna, int linha, Peça_xadrez peca) {
		tabul.colocar_peca(peca, new posicao_xadrez(coluna, linha).convert_posic());
	}
	
	
	//metodo responsavel por iniciar a partida de xadrez, colocando as pecas no tabuleiro
	private void iniciarPartida() {
		
		nova_peca('b', 6, new Torre(tabul, Cor.WHITE));//colcando uma nova peça em determinada posicao
		nova_peca('e', 8, new Rei(tabul, Cor.BLACK)); 
<<<<<<< HEAD
		nova_peca('e', 1, new Rei(tabul, Cor.WHITE));
		nova_peca('c', 1, new Torre(tabul, Cor.WHITE));
		nova_peca('c', 2, new Torre(tabul, Cor.WHITE));
		nova_peca('d', 2, new Torre(tabul, Cor.WHITE));
		nova_peca('e', 2, new Torre(tabul, Cor.WHITE));
		nova_peca('d', 1, new Rei(tabul, Cor.WHITE));
		nova_peca('c', 7, new Torre(tabul, Cor.BLACK));
		nova_peca('c', 8, new Torre(tabul, Cor.BLACK));
		nova_peca('d', 7, new Torre(tabul, Cor.BLACK));
		nova_peca('e', 7, new Torre(tabul, Cor.BLACK));
		nova_peca('d', 8, new Rei(tabul, Cor.BLACK));
=======
		//nova_peca('e', 1, new Rei(tabul, Cor.WHITE));
		//nova_peca('c', 1, new Torre(tabul, Cor.WHITE));
		//nova_peca('c', 2, new Torre(tabul, Cor.WHITE));
		//nova_peca('d', 2, new Torre(tabul, Cor.WHITE));
		//nova_peca('e', 2, new Torre(tabul, Cor.WHITE));
		//nova_peca('e', 1, new Torre(tabul, Cor.WHITE));
		//nova_peca('d', 1, new Rei(tabul, Cor.WHITE));
		//nova_peca('c', 7, new Torre(tabul, Cor.BLACK));
		//nova_peca('c', 8, new Torre(tabul, Cor.BLACK));
		//nova_peca('d', 7, new Torre(tabul, Cor.BLACK));
		//nova_peca('e', 7, new Torre(tabul, Cor.BLACK));
		//nova_peca('e', 8, new Torre(tabul, Cor.BLACK));
		//nova_peca('d', 8, new Rei(tabul, Cor.BLACK));
>>>>>>> e0423a87d22d1158d045fc71256544b240a692df
	}
		
	}
