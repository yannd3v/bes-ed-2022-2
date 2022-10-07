package br.ucsal.bes.ed20222.listas.listasimples;

public class Main {

	public static void main(String[] args) {
		
		ListaEncadeada lista1 = new ListaEncadeada();
		/*lista1.insereInicio(10);
		lista1.insereInicio(20);
		lista1.insereInicio(30);
		lista1.InsereUltimo(40);
		lista1.InsereUltimo(50);
		No no1 = lista1.getInicio().getProximo().getProximo();
		lista1.InsereDepois(no1, 99);
		lista1.insereInicio(10);
		lista1.insereInicio(20);
		lista1.removePrimeiro();
		lista1.mostrarLista();
		System.out.println(lista1)
		System.out.println(lista1.removePrimeiro().getElemento());*/
		lista1.insereInicio(10);
		lista1.insereInicio(20);
		lista1.insereInicio(30);
		lista1.mostrarLista();
		lista1.removeDepois(lista1.getInicio().getProximo());
		lista1.mostrarLista();
		
		/*ListaEncadeada2 lista1 = new ListaEncadeada2();
		lista1.inserirInicio("Yann");
		lista1.inserirInicio("Gorete");
		lista1.inserirInicio("Diva");
		System.out.println(lista1);*/
		
	}

}
