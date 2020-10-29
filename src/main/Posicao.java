package main;

public class Posicao {
	private int linha;
	private char coluna;
	private boolean ocupada;
	
	public Posicao(int linha, char coluna) {
		this.linha = linha;
		this.coluna = coluna;
		this.ocupada = false;
	}

	public int getLinha() {
		return linha;
	}

	public char getColuna() {
		return coluna;
	}

	public boolean isOcupada() {
		return ocupada;
	}

	public void setOcupada(boolean ocupada) {
		this.ocupada = ocupada;
	}
	
}
