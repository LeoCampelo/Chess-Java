package pecas;

import main.Posicao;

public class Dama {
	private char cor;
	private Posicao posicao;
	
	public Dama(Posicao posicao, char cor) {
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
		// A dama anda livremente por todas as direções
		if (destino.getColuna() == origem.getColuna()) { // Andou na mesma linha
			return true;
		} else if (destino.getLinha() == origem.getLinha()) { // Andou na mesma coluna
			return true;
		} else if (Math.abs(destino.getColuna() - origem.getColuna()) == Math.abs(destino.getLinha() - origem.getLinha())) { // Andou na diagonal
			return true;
		} else {
			return false;
		}
	}

	public void print() {
		System.out.print("D");
	}
}
