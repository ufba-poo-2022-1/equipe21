package tabuleiro;

public class Exceção extends RuntimeException{

	private static final long serialVersionUID = 1L;//exceção opcional
	
	public Exceção(String msg) {//construtor que recebe a mensagem
		super(msg);//repassa a mensagem para o construtor da superclasse runtime...
	}

}
