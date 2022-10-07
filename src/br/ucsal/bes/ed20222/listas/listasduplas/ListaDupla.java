package br.ucsal.bes.ed20222.listas.listasduplas;

public class ListaDupla {
	No inicio;
	No fim;
	int tamanho;

	public void mostrarListaIda() {
		No noAuxiliar = inicio;
		while (noAuxiliar != null) {
			System.out.println(noAuxiliar.info);
			noAuxiliar = noAuxiliar.proximo;
		}
	}

	public void mostrarListaVolta() {
		No noAuxiliar = fim;
		while (noAuxiliar != null) {
			System.out.println(noAuxiliar.info);
			noAuxiliar = noAuxiliar.anterior;
		}
	}

	public void inserirInicio(String info) {
		No no = new No();
		no.info = info;
		no.anterior = null;
		no.proximo = inicio;
		if (inicio != null) {
			inicio.anterior = no;
		}
		inicio = no;
		if (tamanho == 0) {
			fim = inicio;
		}
		tamanho++;
	}

	public String removerInicio() {
		if (inicio == null) {
			return null;
		}

		String out = inicio.info;
		inicio = inicio.proximo;
		if (inicio != null) {
			inicio.anterior = null;
		} else {
			fim = null;
		}

		tamanho--;
		return out;
	}

	public void inserirFinal(String info) {
		No no = new No();
		no.info = info;
		no.proximo = null;
		no.anterior = fim;
		if (fim != null) {
			fim.proximo = no;
		}
		fim = no;
		if (tamanho == 0) {
			inicio = fim;
		}
		tamanho++;

	}
	
	public String removerFinal() {
		if(inicio == null) {
			return null;
		}
		String out = fim.info;
		fim = fim.anterior;
		if(fim != null) {
			fim.proximo = null;
		} else {
			inicio = null;
		}
		tamanho--;
		return out;
	}

	@Override
	public String toString() {
		return "ListaDupla [inicio=" + inicio + ", fim=" + fim + ", tamanho=" + tamanho + "]";
	}

}
