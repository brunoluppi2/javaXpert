package br.com.fiap;

import java.util.Random;
import java.util.Scanner;

import br.com.fiap.regras.RegrasDoJogo;

public class JokenpoApp {

	public static void main(String[] args) {

		System.out.println("-------------- JOKENPÔ GAME --------------");
		
		//Declarando as variáveis:
		int escolhaJogador;
		int escolhaJogada;
		int escolhaRandom;
		String jogarNovamente = "S";
		RegrasDoJogo regras = new RegrasDoJogo ();
		
		Scanner leitor = new Scanner (System.in);
		Random aleatorio = new Random();
		
		while (jogarNovamente.equalsIgnoreCase("S")) {
			
		//---------------------
		
		//Selecionando o jogador:
		System.out.println("Quem é você? ");
		System.out.println("1 - Jogador A");
		System.out.println("2 - Jogador B");
		escolhaJogador = leitor.nextInt();

		regras.escolherJogador(escolhaJogador);
		
		//Selecionando a jogada:
		System.out.println("\n" + "Escolha uma opção:" );
		System.out.println("1 - Pedra" );
		System.out.println("2 - Papel" );
		System.out.println("3 - Tesoura" );
		
		escolhaJogada = leitor.nextInt();
		
		regras.escolherJogada(escolhaJogada);
		
		//Definindo o jogo do computador:
		escolhaRandom = (aleatorio.nextInt(3) +1);
						
		regras.escolherRandom(escolhaRandom);
		
		//Definindo quem ganhou:
		regras.escolherGanhador(escolhaJogada, escolhaRandom);
				
		System.out.println("\n Deseja jogar novamente? S / N");
		jogarNovamente = leitor.next();
		
		}
		
		//--------------------------
		
		System.out.println("\n FIM");
				
	}
	
		
}


