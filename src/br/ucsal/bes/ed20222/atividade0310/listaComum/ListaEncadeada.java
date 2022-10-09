package br.ucsal.bes.ed20222.atividade0310.listaComum;


public class ListaEncadeada {
	No inicio;
	int tamanho;
	
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
	

	public void inserir(String info) {
		No no1 = new No();
		no1.info = info;
		no1.proximo = inicio;
		inicio = no1;
		tamanho++;
	
	}
	
	
	public void mostrarLista() {
		No noAuxiliar = inicio;
		while(noAuxiliar != null) {
			System.out.println(noAuxiliar.info);
			noAuxiliar = noAuxiliar.proximo;
		}
		

	}
	
	public boolean pesquisarComuns(String info) {
		No noAuxiliar = inicio;
		boolean nomeIgual = false;
		while(noAuxiliar != null) {
			if (noAuxiliar.info.equalsIgnoreCase(info)) {
				nomeIgual = true;
			}
			noAuxiliar = noAuxiliar.proximo;
		}
		return nomeIgual;
	}
	
	public void exibirComumm() {
		No cursor = inicio;
		while(cursor != null) {
			
		}
	}
	
}
