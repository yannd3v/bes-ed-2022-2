package br.ucsal.bes.ed20222.exercicio1909;

public class ListaProfessores {
	
	public static void main(String[] args) {
		
		ListaEncadeada listaProfessores = new ListaEncadeada();
		listaProfessores.inserirFim("Jeane");
		listaProfessores.inserirInicio("Yann");
		No no = listaProfessores.getInicio();
		listaProfessores.inserirPosicao(no, "Mario Jorge");
		listaProfessores.inserirInicio("Hamilton");
		No no1 = listaProfessores.getInicio().getProximo().getProximo();
		listaProfessores.removeDepois(no1);
		listaProfessores.mostrarLista();
		
	}
}
