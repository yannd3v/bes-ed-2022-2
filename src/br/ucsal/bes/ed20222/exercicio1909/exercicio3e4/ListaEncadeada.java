package br.ucsal.bes.ed20222.exercicio1909.exercicio3e4;

public class ListaEncadeada {
	private No inicio;

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

	public void inserirInicio(Integer info) {
		No no1 = new No();
		no1.setElemento(info);
		no1.setProximo(inicio);
		inicio = no1;
	}

	public void inserirDepois(No no, Integer info) {
		if (estaVazia()) {
			inserirInicio(info);
		} else {
			No noAuxiliar = new No();
			noAuxiliar.setElemento(info);
			noAuxiliar.setProximo(no.getProximo());
			no.setProximo(noAuxiliar);
		}
	}

	public void inserirFim(Integer info) {
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
		}
	}
	
	public void pesquisarElemento(Integer elemento) {
		No noAuxiliar = inicio;
		int posicao = 1;
		while(noAuxiliar != null) {
			if (noAuxiliar.getElemento().equals(elemento)) {
				System.err.println("Elemento " + noAuxiliar.getElemento() + " encontrado na posição " + posicao);
				break;
			}
			noAuxiliar = noAuxiliar.getProximo();
			posicao++;
		}

	}
}
