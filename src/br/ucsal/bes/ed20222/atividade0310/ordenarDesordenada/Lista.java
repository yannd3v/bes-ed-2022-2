package br.ucsal.bes.ed20222.atividade0310.ordenarDesordenada;

public class Lista {

	public static void main(String[] args) {
		
		ListaEncadeada listaDesordenadaL = new ListaEncadeada();
		
		System.out.println("----------- INSERINDO NA LISTA L ------------");
		listaDesordenadaL.insere(18123);
		listaDesordenadaL.insere(1273);
		listaDesordenadaL.insere(35123471);
		listaDesordenadaL.insere(42325);
		listaDesordenadaL.insere(532);
		listaDesordenadaL.insere(65);
		listaDesordenadaL.mostrarLista();
		System.out.println("---------- LISTA K ----------");
		Lista.ordenar(listaDesordenadaL).mostrarLista();
		System.out.println("---------- LISTA L ----------");
		listaDesordenadaL.mostrarLista();

		

	}
	
	
	public static ListaEncadeada ordenar(ListaEncadeada listaDesordenadaL) {
		ListaEncadeada listaOrdenadaK = new ListaEncadeada();
		No no = listaDesordenadaL.getInicio();
		No noAuxiliar = no;
		int auxiliarInt = noAuxiliar.getElemento();
		int contEx = 0;
		int contInt = 0;
		while(contEx != listaDesordenadaL.getTotalElemento()) { // aqui
			while(no.getProximo() != null) {
				if(no.getProximo().getElemento() > auxiliarInt) {
					noAuxiliar = no;
					auxiliarInt = noAuxiliar.getProximo().getElemento();
					contInt++;
				}
				no = no.getProximo();
			}
			if(contInt == 0) {
				listaOrdenadaK.insere(no.getElemento());
				listaDesordenadaL.setInicio(noAuxiliar.getProximo());
			} else {
				listaOrdenadaK.insere(auxiliarInt);
				noAuxiliar.setProximo(noAuxiliar.getProximo().getProximo());
			}
			contInt = 0;
			noAuxiliar = no = listaDesordenadaL.getInicio();
			if(noAuxiliar != null) {
				auxiliarInt = noAuxiliar.getElemento();
			}
			contEx++;
		}
		
		return listaOrdenadaK;
	}

	
}
