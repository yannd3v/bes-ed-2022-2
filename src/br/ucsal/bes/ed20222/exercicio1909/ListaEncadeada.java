package br.ucsal.bes.ed20222.exercicio1909;

public class ListaEncadeada {
	
	private No inicio;
	private int tamanho = 0;
	
	public ListaEncadeada() {
		super();
		this.inicio = null;
	}
	
	
	public boolean estaVazia() {
		if(inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public void mostrarLista() {
		No noAux = inicio;
		while(noAux != null) {
			System.out.println(noAux.getElemento());
			noAux = noAux.getProximo();
		}
	}
	
	public void inserirInicio(String info) {
		No no1 = new No();
		no1.setElemento(info);
		no1.setProximo(inicio);
		inicio = no1;
		tamanho ++;
	}
		
	public void inserirPosicao(No no, String info) {
		if(estaVazia()) {
			inserirInicio(info);
		} else {
			No noAux = new No();
			noAux.setElemento(info);
			noAux.setProximo(no.getProximo());
			no.setProximo(noAux);
		}
		tamanho++;
	}
	
	public void inserirFim(String info) {
		if(estaVazia()) {
			inserirInicio(info);
		} else {
			No noAux = inicio;
			while(noAux.getProximo() != null) {
				noAux = noAux.getProximo();
			}
			No no1 = new No();
			no1.setElemento(info);
			noAux.setProximo(no1);
			tamanho++;
		}
	}
	
	public No removePrimeiro() {
		if(estaVazia()) {
			return null;
		} else {
			No noAux = new No();
			noAux = inicio;
			inicio = inicio.getProximo();
			tamanho--;
			return noAux;
		}
	}
	
	public void removeDepois(No no) {
		if(estaVazia()) {
			System.out.println("VAZIA");
		} else {
			No noAux = inicio;
			No anterior = null;
			while(noAux.getProximo() != null) {
				anterior = noAux;
				noAux = noAux.getProximo();
				if(noAux.equals(no)) {
					System.out.println("NÓ ENCONTRADO " + noAux.getElemento());
					anterior.setProximo(noAux.getProximo());
				}
			}
		}
	}


	public No getInicio() {
		return inicio;
	}


	public void setInicio(No inicio) {
		this.inicio = inicio;
	}


	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio.getElemento() + ", tamanho=" + tamanho + "]";
	}
	

}
