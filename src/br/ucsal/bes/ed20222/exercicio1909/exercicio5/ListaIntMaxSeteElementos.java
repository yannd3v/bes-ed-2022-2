package br.ucsal.bes.ed20222.exercicio1909.exercicio5;


public class ListaIntMaxSeteElementos {
	
	public static void main(String[] args) {
		ListaEncadeada listaSeteElementos = new ListaEncadeada();
		listaSeteElementos.inserirInicio(7);
		listaSeteElementos.inserirInicio(6);
		listaSeteElementos.inserirInicio(5);
		listaSeteElementos.inserirInicio(4);
		listaSeteElementos.inserirFim(3);
		listaSeteElementos.inserirFim(2);
		listaSeteElementos.inserirFim(1);
		listaSeteElementos.inserirFim(0); // Vai dar erro informando que já possui 7 elementos
		listaSeteElementos.mostrarLista();
		
	}
}
