package br.ucsal.bes.ed20222.atividade0310.ordenarDesordenada;

public class ListaEncadeada {
	private No inicio;
	private int totalElemento;
	
	public ListaEncadeada() {
		super();
		this.inicio = null;
	}
	

	public int getTotalElemento() {
		return totalElemento;
	}



	public No getInicio() {
		return inicio;
	}
	
	
	public void setInicio(No inicio) {
		this.inicio = inicio;
	}


	public boolean estaVazia() {
		if(inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	

	public void insere(int info) {
		No no1 = new No(info);
		no1.setProximo(inicio);
		inicio = no1;
		totalElemento++;
	}
	
	
	public void mostrarLista() {
		if(estaVazia()) {
			System.err.println("LISTA VAZIA");
		} else {
			No noAuxiliar = inicio;
			while(noAuxiliar != null) {
				System.out.println(noAuxiliar.getElemento());
				noAuxiliar = noAuxiliar.getProximo();
			}
		}
	}
	
	
}
