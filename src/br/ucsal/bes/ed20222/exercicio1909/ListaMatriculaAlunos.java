package br.ucsal.bes.ed20222.exercicio1909;

public class ListaMatriculaAlunos {

	public static void main(String[] args) {
		
		ListaEncadeada listaAlunos = new ListaEncadeada();
		listaAlunos.inserirFim("Yann");
		listaAlunos.inserirInicio("Davi");
		No no = listaAlunos.getInicio();
		listaAlunos.inserirDepois(no, "Rogerio");
		listaAlunos.inserirInicio("Caio");
		No no1 = listaAlunos.getInicio().getProximo().getProximo();
		listaAlunos.removeDepois(no1);
		listaAlunos.mostrarLista();
		listaAlunos.apagarLista();
		
		System.out.println("*******DEPOIS DE APAGAR A LISTA*********");
		listaAlunos.mostrarLista();
		listaAlunos.inserirInicio("Bruno");
		No no2 = listaAlunos.getInicio();
		listaAlunos.inserirDepois(no2, "Isaac");
		listaAlunos.inserirFim("Isis");
		No no3 = listaAlunos.getInicio().getProximo();
		listaAlunos.removeDepois(no3);
		listaAlunos.inserirFim("Fernanda");
		listaAlunos.inserirInicio("Caio");
		No no4 = listaAlunos.getInicio();
		listaAlunos.inserirDepois(no4, "Fabio");
		listaAlunos.mostrarLista();
		listaAlunos.pesquisarElemento("Fernanda");
		listaAlunos.ordemAlf();

	}

}
