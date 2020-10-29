package main;

public class Tabuleiro {
	// Como a classe Pe�a ainda n�o foi implementada, ainda n�o � poss�vel inicializar 
	// a matriz de posi��es, pois em cada posi��o vai uma pe�a
	Posicao[][] posicoes;
	
	public Tabuleiro() {
		this.posicoes = new Posicao[8][8];
	}
	
	// Setando as linhas e colunas de cada posi��o
	public void inicializaTabuleiro() {
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				posicoes[i][j] = new Posicao(i + 1, (char) ('A'+ j));
			}
		}
	}
	
	public void imprimeTabuleiro() {
		//Aqui seria necess�ria a classe Pe�a para acessar os tipos de pe�a
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
