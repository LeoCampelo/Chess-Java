package pecas;

import main.Posicao;

public class Cavalo {
	private char cor;
	private Posicao posicao;
	
	public Cavalo(Posicao posicao, char cor) {
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
		// Caso se movimente duas casas acima
		if (destino.getColuna() - origem.getColuna() == -2) {
			// Caso se movimentou para direita
			if (origem.getLinha() - 1 == destino.getLinha()) {
				return true;
			} else if (origem.getLinha() + 1 == destino.getLinha()) { // O mesmo vale para esquerda
				return true;
			}
		} else if (destino.getColuna() - origem.getColuna() == 2) { // Caso se movimente duas casas abaixo
			// Mesma validação de direita ou esquerda
			if (origem.getLinha() - 1 == destino.getLinha()) {
				return true;
			} else if (origem.getLinha() + 1 == destino.getLinha()) {
				return true;
			}
		} else if (destino.getLinha() - origem.getLinha() == 2) { // Movimentou duas casas a direita
			// Caso se movimentou para cima
			if (origem.getColuna() + 1 == destino.getColuna() ) {
				return true;
			} else if (origem.getColuna() - 1 == destino.getColuna() ) { // O mesmo vale para baixo
				return true;
			}
		} else if (destino.getLinha() - origem.getLinha() == -2) { //  Movimentou duas casas a esquerda
			// Mesma validação de cima ou baixo
			if (origem.getColuna() + 1 == destino.getColuna()) {
				return true;
			} else if (origem.getColuna() - 1 == destino.getColuna()) {
				return true;
			}
		}

		return false;
	}
	
	public void print() {
		System.out.print("C");
	}
}
