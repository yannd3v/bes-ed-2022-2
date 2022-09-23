package br.ucsal.bes.ed20222.exercicio1909;

public class No {
	
	private No proximo;
	private String elemento;
	
	
//	public No(String elemento) {
//		super();
//		this.elemento = elemento;
//	}
	
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}
	@Override
	public String toString() {
		return "No [proximo=" + proximo + ", elemento=" + elemento + "]";
	}	
	
	
	
}
