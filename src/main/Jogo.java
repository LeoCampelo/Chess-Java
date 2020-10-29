package main;

import java.util.Scanner;

public class Jogo {
	private Tabuleiro tabuleiro;
	private Jogador jogador1;
	private Jogador jogador2;
	private char vezCor;
	// Vari�vel para controlar o estado atual do jogo
	private int estado;
	
	// Construtor padr�o
	public Jogo(String nome1, String nome2) {
		this.tabuleiro = new Tabuleiro();
		// As pe�as brancas sempre come�am
		this.vezCor = 'B';
	}
	
	// Metodo responsavel por iniciar a partida e receber as informa��es sobre a mesma
	public void jogar() {
		this.estado = 1; // Jogando
		String nome1;
		String nome2;
		String movimento;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bem-vindos, digite o nome do jogador 1:");
		nome1 = scanner.next();
		
		System.out.println("Agora digite o nome do jogador 2:");
		nome2 = scanner.next();
		
		// Inicializa os jogadores depois de receber os seus nomes
		// Por padr�o ser� considerado o jogador 1 como pe�as brancas e o 2 como as pretas
		this.jogador1 = new Jogador(nome1, 'B');
		this.jogador2 = new Jogador(nome2, 'P');
		
		System.out.println("O jogo ir� come�ar agora!\n\n");
		
		this.tabuleiro.imprimeTabuleiro();
		System.out.print("\n");
		
		while(estado != 2) { // 2 = Encerrado
			if(this.vezCor == 'B') {
				System.out.println(this.jogador1.getNome() + " fa�a a sua jogada!");
			} else {
				System.out.println(this.jogador2.getNome() + " fa�a a sua jogada!");
			}
			
			movimento = scanner.next();
			if(validaStringMovimento(movimento)) {
				//mover(movimento, this.corVez);
				if(this.vezCor == 'B') {
					this.vezCor = 'P';
				} else {
					this.vezCor = 'B';
				}
			} else {
				System.out.println("Jogada inv�lida!");
			}
		}
	}
	
	public boolean validaStringMovimento(String movimento) {
		return true;
	}
	
	
	
}
