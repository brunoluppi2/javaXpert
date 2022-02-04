package br.com.fiap.regras;

public class RegrasDoJogo {
	
	public void escolherJogador (int escolhaJogador) {
						
		if (escolhaJogador == 1) {
			System.out.println("Você é o jogador A!");
		} else if (escolhaJogador == 2) { 
			System.out.println("Você é o jogador B!");
		} else {
			System.out.println("Opção inválida.");
		}
			
	 }
	
	public void escolherJogada (int escolhaJogada) {
		
		if (escolhaJogada == 1) {
			System.out.println("\n Você escolheu Pedra");
		} else if (escolhaJogada == 2) { 
			System.out.println("\n Você escolheu Papel!");
		} else if (escolhaJogada == 3) { 
			System.out.println("\n Você escolheu Tesoura!");			
		} else {
			System.out.println("Opção inválida.");
		}
		
	}
	
	public void escolherRandom (int escolhaRandom) {
		if (escolhaRandom == 1) {
			System.out.println("O outro jogador escolheu Pedra!");
		} else if (escolhaRandom == 2) { 
			System.out.println("O outro jogador escolheu Papel!");
		} else { 
			System.out.println("O outro jogador escolheu Tesoura!");			
		} 
	}
	
	public void escolherGanhador (int escolhaJogada, int escolhaRandom) {
		if (escolhaJogada == 1 && escolhaRandom == 2) {
			System.out.println("\n Papel envolve a pedra, você perdeu ;/ ");
		} else if (escolhaJogada == 1 && escolhaRandom == 3) {
			System.out.println("\n Pedra quebra tesoura, você ganhou ;) ");
		} else if (escolhaJogada == 2 && escolhaRandom == 1) {
			System.out.println("\n Papel envolve a pedra, você ganhou ;) ");
		} else if (escolhaJogada == 2 && escolhaRandom == 3) {
			System.out.println("\n Tesoura corta papel, você perdeu ;/ ");
		} else if (escolhaJogada == 3 && escolhaRandom == 1) {
			System.out.println("\n Pedra quebra tesoura, você perdeu ;/ ");
		} else if (escolhaJogada == 3 && escolhaRandom == 2) {
			System.out.println("\n Tesoura corta papel, você ganhou ;) ");
		} else { 
			System.out.println("\n Empate!!!");
		}
	}
}
	
