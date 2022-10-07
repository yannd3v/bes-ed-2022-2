package br.ucsal.bes.ed20222.listas.listasimples;

public class No {
	
	private No proximo;
	private int elemento;
	
	public No(int elemento) {
		super();
		this.elemento = elemento;
	}
	
	public No(No proximo, int elemento) {
		super();
		this.proximo = proximo;
		this.elemento = elemento;
	}

	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public int getElemento() {
		return elemento;
	}
	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	

}
