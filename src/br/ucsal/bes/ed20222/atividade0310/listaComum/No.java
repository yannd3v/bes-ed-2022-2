package br.ucsal.bes.ed20222.atividade0310.listaComum;

import java.util.Objects;

public class No {
	private No proximo;
	private String elemento;
	
	public No(String elemento) {
		super();
		this.elemento = elemento;
	}
	
	public No(No proximo, String elemento) {
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
	public String getElemento() {
		return elemento;
	}
	public void setElemento(String elemento) {
		this.elemento = elemento;
	}

	@Override
	public int hashCode() {
		return Objects.hash(elemento, proximo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		No other = (No) obj;
		return Objects.equals(elemento, other.elemento) && Objects.equals(proximo, other.proximo);
	}
	
	
}
