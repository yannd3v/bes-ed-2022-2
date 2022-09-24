package br.ucsal.bes.ed20222.exercicio1909.exercicio1e2;

public class ListaProfessores {
	
	public static void main(String[] args) {
		
		ListaEncadeada listaProfessores = new ListaEncadeada();
		listaProfessores.inserirFim("Jeane");
		listaProfessores.inserirInicio("Neiva");
		No no = listaProfessores.getInicio();
		listaProfessores.inserirDepois(no, "Mario Jorge");
		listaProfessores.inserirInicio("Hamilton");
		No no1 = listaProfessores.getInicio().getProximo().getProximo();
		listaProfessores.removeDepois(no1);
		listaProfessores.mostrarLista();
		listaProfessores.apagarLista();
		
		System.out.println("*******DEPOIS DE APAGAR A LISTA*********");
		listaProfessores.mostrarLista();
		listaProfessores.inserirInicio("Fernando");
		No no2 = listaProfessores.getInicio();
		listaProfessores.inserirDepois(no2, "Marcos");
		listaProfessores.inserirFim("Ronilson");
		No no3 = listaProfessores.getInicio().getProximo();
		listaProfessores.removeDepois(no3);
		listaProfessores.mostrarLista();
		
	}
}
