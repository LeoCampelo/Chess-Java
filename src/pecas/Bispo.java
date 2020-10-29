package pecas;

import main.Posicao;

public class Bispo {
	private char cor;
	private Posicao posicao;
	
	public Bispo(Posicao posicao, char cor) {
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
		// O bispo anda apenas em diagonal
		if (Math.abs(destino.getLinha() - origem.getLinha()) == Math.abs(destino.getColuna() - origem.getColuna())) {
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		System.out.print("B");
	}
}
