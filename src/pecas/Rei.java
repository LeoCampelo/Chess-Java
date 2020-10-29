package pecas;

import main.Posicao;

public class Rei {
	private char cor;
	private Posicao posicao;
	
	public Rei(Posicao posicao, char cor) {
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
		// O rei percorre apenas uma casa em qualquer direção
		if ((destino.getColuna() == origem.getColuna()+1 && destino.getLinha() == origem.getLinha())  || // Movimento para direita
			(destino.getColuna() == origem.getColuna()-1 && destino.getLinha() == origem.getLinha())  || // Movimento para esquerda
			(destino.getColuna() == origem.getColuna()   && destino.getLinha() == origem.getLinha()-1)|| // Movimento para baixo
			(destino.getColuna() == origem.getColuna()   && destino.getLinha() == origem.getLinha()+1)|| // Movimento para cima 
			(destino.getColuna() == origem.getColuna()+1 && destino.getLinha() == origem.getLinha()+1)|| // Movimento para digonal superior direita
			(destino.getColuna() == origem.getColuna()-1 && destino.getLinha() == origem.getLinha()+1)|| // Movimento para diagonal superior esquerda
			(destino.getColuna() == origem.getColuna()+1 && destino.getLinha() == origem.getLinha()-1)|| // Movimento para diagonal inferior direita
			(destino.getColuna() == origem.getColuna()-1 && destino.getLinha() == origem.getLinha()-1)){ // Movimento para diagonal inferior esquerda
			return true;
		} else {
			return false;
		}
	}
	
	public void print() {
		System.out.print("R");
	}
}
