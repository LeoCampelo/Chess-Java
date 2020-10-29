package pecas;

import main.Posicao;

public class Peao {
	private char cor;
	private Posicao posicao;
	
	public Peao(Posicao posicao, char cor) {
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
		// O peão não se movimenta para trás
		if((this.cor == 'P' && origem.getLinha() < destino.getLinha()) || (this.cor == 'B' && origem.getLinha() > destino.getLinha())) {
			return false;  
		}
		
		// O peão não se movimenta na horizontal, apenas quando for capturar outra peça
		if( origem.getColuna() != destino.getColuna() ) {
			// Checagem se a posição destino está na proxima linha para peões brancos ou abaixo da linha para peões pretos
			if(((origem.getLinha() == destino.getLinha() + 1 && this.cor == 'P') || (origem.getLinha() == destino.getLinha() - 1 && this.cor == 'B')) && 
				(origem.getColuna() == destino.getColuna() + 1 || origem.getColuna() == destino.getColuna() - 1)) {
				if(destino.isOcupada()) {
					return true;
				} 
			}
		}

		// O peão só anda uma casa por vez
		if(origem.getLinha() - destino.getLinha() != 1  && origem.getLinha() - destino.getLinha() != -1) {
			// Verifica se o peão está na posição inicial
			if((origem.getLinha() == 2 && cor == 'B') || (origem.getLinha() == 7 && cor == 'P')) {
	            // Pode andar até duas casas no primeiro movimento
				// A classe Math tem o método abs() que retorna o valor absoluto do parâmetro passado
	            if(Math.abs(origem.getLinha() - destino.getLinha()) <= 2 && origem.getColuna() == destino.getColuna()) {
	                return true;
	            } else {
	                return false;
	            }
			} else {
				return false;
			}
		} else {
			if(origem.getColuna() == destino.getColuna() && !destino.isOcupada()) {
				return true;
			}
		}
		
		return false;
	}
	
	public void print() {
		System.out.print("P");
	}
}
