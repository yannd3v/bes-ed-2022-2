package br.ucsal.bes.ed20222.listas;

public class ListaEncadeada2 {
	
	private No2 inicio = null;
	private int totalElementos = 0;
	
	
	public void inserirInicio(String info) {
		No2 no = new No2();
		no.setInfo(info);
		no.setProximo(inicio);
		inicio = no; // inicio = no(info) e no(proximo)
		totalElementos++;
	}


	@Override
	public String toString() {
		return "ListaEncadeada2 [inicio=" + inicio.getInfo() + ", totalElementos=" + totalElementos + "]";
	}


	

}
