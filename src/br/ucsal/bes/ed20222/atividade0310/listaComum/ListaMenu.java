package br.ucsal.bes.ed20222.atividade0310.listaComum;

import java.util.Scanner;


public class ListaMenu {
	private static final Scanner entrada = new Scanner(System.in);
	private static boolean sair = false;
	
	public static void executar() {
		do {
			System.out.println("O que deseja ? \n1-Inserir nome  \n2-Listar \n3-Lista de nomes comuns \n4-Sair");
			int opcao = entrada.nextInt();
			switch (opcao) {
			case 1: Lista.lerNomes();
					break;
			case 2: Lista.exibir();
					break;
			case 3: Lista.exibirComum();
					break;
			default: 
					sair = true;
					break;
			}
		} while (!sair);
	}
}
