package pecas;

import main.Posicao;

public class Torre {
	private char cor;
	private Posicao posicao;
	
	public Torre(Posicao posicao, char cor) {
		this.posicao = posicao;
		this.cor = cor;
	}
	
	public char getCor() {
		return this.cor;
	}
	
	public Posicao getPosicao() {
		return posicao;
	}
	
	public boolean validaMovimento(Posicao origem, Posicao destino) {
		// Se movimentou na mesma linha
		if(origem.getColuna() == destino.getColuna()) {
			return true;
		} else if(origem.getLinha() == destino.getLinha()) { // Se movimentou na mesma coluna
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		System.out.print("T");
	}
}
