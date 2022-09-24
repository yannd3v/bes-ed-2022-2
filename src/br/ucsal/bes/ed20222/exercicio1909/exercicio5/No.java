package br.ucsal.bes.ed20222.exercicio1909.exercicio5;

public class No {
	private No proximo;
	private Integer elemento;
	
	public No getProximo() {
		return proximo;
	}
	public void setProximo(No proximo) {
		this.proximo = proximo;
	}
	public Integer getElemento() {
		return elemento;
	}
	public void setElemento(Integer elemento) {
		this.elemento = elemento;
	}
	@Override
	public String toString() {
		return "Numero " + elemento;
	}
}
