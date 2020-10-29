package main;

public class Tabuleiro {
	// Como a classe Peça ainda não foi implementada, ainda não é possível inicializar 
	// a matriz de posições, pois em cada posição vai uma peça
	Posicao[][] posicoes;
	
	public Tabuleiro() {
		this.posicoes = new Posicao[8][8];
	}
	
	// Setando as linhas e colunas de cada posição
	public void inicializaTabuleiro() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				posicoes[i][j] = new Posicao(i + 1, (char) ('A'+ j));
			}
		}
	}
	
	public void imprimeTabuleiro() {
		//Aqui seria necessária a classe Peça para acessar os tipos de peça
		System.out.print("  ");
		
		for(int i = 0; i < 8; i++) {
			System.out.print((char)('A' + i) + " ");
		}
		
		System.out.print("\n");
		
		for(int i = 0; i < 8; i++) {
			System.out.print((i+1) + " ");
			for(int j = 0; j < 8; j++) {
				System.out.print("- ");
			}
			System.out.print("\n");
		}
		
	}
}
