package br.ucsal.bes.ed20222.listas.listacircular;

public class MainList {

	public static void main(String[] args) {
		
		ListaCircular l1 = new ListaCircular();
		l1.adicionarLista(1);
		l1.adicionarLista(2);
		l1.adicionarLista(3);
		l1.adicionarLista(4);
		l1.adicionarLista(5);
		l1.adicionarLista(6);
		l1.adicionarLista(7);
		System.out.println(l1.toString());
		l1.removerLista();
		l1.removerLista();
		System.out.println("------ LISTA APÓS REMOÇÃO ------");
		System.out.println(l1.toString());

	}

}
