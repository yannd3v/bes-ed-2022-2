package br.ucsal.bes.ed20222.atividade0310.listaComum;

import java.util.Scanner;

public class Lista {


	static ListaEncadeada l1 = new ListaEncadeada();
	static ListaEncadeada l2 = new ListaEncadeada();
	static ListaEncadeada l3 = new ListaEncadeada();
	
	public static void lerNomes() {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira o primeiro nome: ");
		String nome1 = entrada.nextLine();
		System.out.println("Insira o segundo nome");
		String nome2 = entrada.nextLine();
		l1.inserir(nome1);
		l2.inserir(nome2);
		if(l2.pesquisarComuns(nome1)) {
			l3.inserir(nome1);
		} else if(l1.pesquisarComuns(nome2)) {
			l3.inserir(nome2);
		}
	}

	public static void exibir() {
		System.out.println("----------LISTA 1-----------");
		l1.mostrarLista();
		System.out.println("----------LISTA 2-----------");
		l2.mostrarLista();
	}
	
	
	public static void exibirComum() {
		System.out.println("---------LISTA COMUM--------");
		l3.mostrarLista();
	}

	

}
