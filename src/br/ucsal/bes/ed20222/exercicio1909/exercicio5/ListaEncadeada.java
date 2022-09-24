package br.ucsal.bes.ed20222.exercicio1909.exercicio5;

public class ListaEncadeada {
	private No inicio;
	private int qtElemento = 1;

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
		if(qtElemento <= 7) {
		No no1 = new No();
		no1.setElemento(info);
		no1.setProximo(inicio);
		inicio = no1;
		qtElemento++;
		} else {
			System.err.println("A Lista já possui 7 elementos");
		}
	}

	public void inserirFim(Integer info) {
		if(qtElemento <= 7) {
			No noAuxiliar = inicio;
			while (noAuxiliar.getProximo() != null) {
				noAuxiliar = noAuxiliar.getProximo();
			}
			No no1 = new No();
			no1.setElemento(info);
			noAuxiliar.setProximo(no1);
			qtElemento++;
		} else {
			System.err.println("A Lista já possui 7 elementos");
		}
	}
}
