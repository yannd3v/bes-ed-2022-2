package br.ucsal.bes.ed20222.listas.listasimples;

public class ListaEncadeada {
	
	private No inicio;
	private int totalElemento;

	public ListaEncadeada() {
		super();
		this.inicio = null;
	}

	public No getInicio() {
		return inicio;
	}
	
	// A lista está vazia ?
	
	public boolean estaVazia() {
		if(inicio == null) {
			return true;
		} else {
			return false;
		}
	}
	
	// Inserir elemento na primeira posição, sendo a lista vázia ou não

	public void insereInicio(int info) {
		No no1 = new No(info);
		no1.setProximo(inicio);
		inicio = no1;
		totalElemento++;
	}
	
	// Mostra a lista
	
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
	
	// Inserir elemento na ultima posição
	
	public void InsereUltimo(int info) {
		if(estaVazia()) {
			insereInicio(info);
		} else {
			No noAuxiliar = inicio;
			while(noAuxiliar.getProximo() != null) {
				noAuxiliar = noAuxiliar.getProximo();	
			}
			No no1 = new No(info);
			noAuxiliar.setProximo(no1);
			totalElemento++;
		}
	}
	
	// Inserir um elemento na posição 'n'
	
	public void InsereDepois(No no, int info) {
		No no1 = new No(info);
		no1.setProximo(no.getProximo());
		no.setProximo(no1);
		totalElemento++;
	}
	
	// Metodos de remocao
	
	// remove primeiro
	
	public No removePrimeiro() {
		if(estaVazia()) {
			System.out.println("Lista vazia");
			return null;
		} else {
			No noAuxiliar = inicio;
			inicio = inicio.getProximo();
			totalElemento--;
			return noAuxiliar;
		}
	}
	
	// remove depois
	
	public void removeDepois(No no) {
		if(estaVazia()) {
			System.out.println("Lista vazia");
		} else {
			No anterior = null;
			No noAuxiliar = inicio;
			while(noAuxiliar.getProximo() != null) {
				anterior = noAuxiliar;
				noAuxiliar = noAuxiliar.getProximo();
				if(noAuxiliar.equals(no)) {
					System.out.println("No encontrado com sucesso " + noAuxiliar.getElemento());
					anterior.setProximo(noAuxiliar.getProximo());
				}
			}
		}
	}

	@Override
	public String toString() {
		return "ListaEncadeada [inicio=" + inicio.getElemento() + ", totalElemento=" + totalElemento + "]";
	}
	
	
	
	
	
}
