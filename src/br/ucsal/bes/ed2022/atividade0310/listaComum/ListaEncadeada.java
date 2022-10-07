package br.ucsal.bes.ed2022.atividade0310.listaComum;

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
	
	
	public boolean estaVazia() {
		if(inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	

	public void insere(String info) {
		No no1 = new No(info);
		no1.setProximo(inicio);
		inicio = no1;
		totalElemento++;
	}
	
	
	public void mostrarLista() {
		if(estaVazia()) {
			System.out.println("LISTA VAZIA");
		} else {
			No noAuxiliar = inicio;
			while(noAuxiliar != null) {
				System.out.println(noAuxiliar.getElemento());
				noAuxiliar = noAuxiliar.getProximo();
			}
		}
	}
	

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio.getElemento() + ", totalElemento=" + totalElemento + "]";
	}
	
}
