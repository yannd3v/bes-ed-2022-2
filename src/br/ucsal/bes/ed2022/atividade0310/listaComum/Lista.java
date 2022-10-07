package br.ucsal.bes.ed2022.atividade0310.listaComum;

import java.util.Scanner;

public class Lista {


	static ListaEncadeada l1 = new ListaEncadeada();
	static ListaEncadeada l2 = new ListaEncadeada();
	static ListaEncadeada l3 = new ListaEncadeada();
	
	
	public static void inserir() {
		
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o primeiro nome: ");
		String nome1 = entrada.nextLine();
		System.out.println("Insira o segundo nome");
		String nome2 = entrada.nextLine();
		l1.insere(nome1);
		l2.insere(nome2);
		if(nome1.equalsIgnoreCase(nome2)) {
			l3.insere(nome1);
		}
	}

	public static void exibir() {
		System.out.println("----------LISTA 1-----------");
		l1.mostrarLista();
		System.out.println("----------LISTA 2-----------");
		l2.mostrarLista();
	}
	
	
	public static void exibirComum() {
		l3.mostrarLista();
	}

	

}
