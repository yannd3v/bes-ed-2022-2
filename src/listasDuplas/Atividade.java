package listasDuplas;

public class Atividade {

	public static void main(String[] args) {
		
		ListaDupla lista = new ListaDupla();
//		lista.inserirInicio("Isaac");
//		lista.inserirInicio("Yann");
//		lista.inserirInicio("Caio");
//		lista.inserirInicio("Rogerio");
//		lista.inserirInicio("Isis");
//		lista.inserirInicio("Fernanda");
//		lista.inserirInicio("Davi");
//		lista.inserirInicio("Bruno");
//		lista.removerInicio();
		lista.mostrarListaIda();
//		lista.mostrarListaVolta();
		System.out.println("##############");
		lista.inserirFinal("Yann");
		lista.removerFinal();
		lista.mostrarListaIda();
	}

}
