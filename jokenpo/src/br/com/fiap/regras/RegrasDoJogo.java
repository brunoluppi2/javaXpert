package br.com.fiap.regras;

public class RegrasDoJogo {
	
	public void escolherJogador (int escolhaJogador) {
						
		if (escolhaJogador == 1) {
			System.out.println("Voc� � o jogador A!");
		} else if (escolhaJogador == 2) { 
			System.out.println("Voc� � o jogador B!");
		} else {
			System.out.println("Op��o inv�lida.");
		}
			
	 }
	
	public void escolherJogada (int escolhaJogada) {
		
		if (escolhaJogada == 1) {
			System.out.println("\n Voc� escolheu Pedra");
		} else if (escolhaJogada == 2) { 
			System.out.println("\n Voc� escolheu Papel!");
		} else if (escolhaJogada == 3) { 
			System.out.println("\n Voc� escolheu Tesoura!");			
		} else {
			System.out.println("Op��o inv�lida.");
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
			System.out.println("\n Papel envolve a pedra, voc� perdeu ;/ ");
		} else if (escolhaJogada == 1 && escolhaRandom == 3) {
			System.out.println("\n Pedra quebra tesoura, voc� ganhou ;) ");
		} else if (escolhaJogada == 2 && escolhaRandom == 1) {
			System.out.println("\n Papel envolve a pedra, voc� ganhou ;) ");
		} else if (escolhaJogada == 2 && escolhaRandom == 3) {
			System.out.println("\n Tesoura corta papel, voc� perdeu ;/ ");
		} else if (escolhaJogada == 3 && escolhaRandom == 1) {
			System.out.println("\n Pedra quebra tesoura, voc� perdeu ;/ ");
		} else if (escolhaJogada == 3 && escolhaRandom == 2) {
			System.out.println("\n Tesoura corta papel, voc� ganhou ;) ");
		} else { 
			System.out.println("\n Empate!!!");
		}
	}
}
	
