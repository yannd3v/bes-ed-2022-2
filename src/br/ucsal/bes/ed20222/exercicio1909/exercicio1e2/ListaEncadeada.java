package br.ucsal.bes.ed20222.exercicio1909.exercicio1e2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class ListaEncadeada {

	private No inicio;
	private int tamanho = 0;

	public ListaEncadeada() {
		super();
		this.inicio = null;
	}

	public boolean estaVazia() {
		if (inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	public void mostrarLista() {
		No noAuxiliar = inicio;
		while (noAuxiliar != null) {
			System.out.println(noAuxiliar.getElemento());
			noAuxiliar = noAuxiliar.getProximo();
		}
	}

	public void inserirInicio(String info) {
		No no1 = new No();
		no1.setElemento(info);
		no1.setProximo(inicio);
		inicio = no1;
		tamanho++;
	}

	public void inserirDepois(No no, String info) {
		if (estaVazia()) {
			inserirInicio(info);
		} else {
			No noAuxiliar = new No();
			noAuxiliar.setElemento(info);
			noAuxiliar.setProximo(no.getProximo());
			no.setProximo(noAuxiliar);
		}
		tamanho++;
	}

	public void inserirFim(String info) {
		if (estaVazia()) {
			inserirInicio(info);
		} else {
			No noAuxiliar = inicio;
			while (noAuxiliar.getProximo() != null) {
				noAuxiliar = noAuxiliar.getProximo();
			}
			No no1 = new No();
			no1.setElemento(info);
			noAuxiliar.setProximo(no1);
			tamanho++;
		}
	}

	public No removePrimeiro() {
		if (estaVazia()) {
			return null;
		} else {
			No noAuxiliar = new No();
			noAuxiliar = inicio;
			inicio = inicio.getProximo();
			tamanho--;
			return noAuxiliar;
		}
	}

	public void removeDepois(No no) {
		if (estaVazia()) {
			System.out.println("VAZIA");
		} else {
			No noAuxiliar = inicio;
			No noAnterior = null;
			while (noAuxiliar.getProximo() != null) {
				noAnterior = noAuxiliar;
				noAuxiliar = noAuxiliar.getProximo();
				if (noAuxiliar.equals(no)) {
					noAnterior.setProximo(noAuxiliar.getProximo());
				}
			}
		}
	}
	
	public void pesquisarElemento(String elemento) {
		No noAuxiliar = inicio;
		while(noAuxiliar != null) {
			if (noAuxiliar.getElemento().equalsIgnoreCase(elemento)) {
				System.err.println("ELEMENTO ENCONTRADO");
				break;
			}
			noAuxiliar = noAuxiliar.getProximo();
		}

	}
	
	
	
	public void ordemAlf() {
		No noAuxiliar = inicio;
		List<String> nomes = new ArrayList<>();
		while (noAuxiliar != null) {
			nomes.add(noAuxiliar.getElemento());
			noAuxiliar = noAuxiliar.getProximo();
			
		}
		Collections.sort(nomes);
		System.out.println(nomes);
	}
		

	public void apagarLista() {
		inicio = null;
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
