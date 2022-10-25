package br.ucsal.bes.ed20222.listas.listacircular;

public class ListaCircular {
	
   No inicio;
   No fim;
   int tamanho;
   
   public ListaCircular() {
	   this.inicio = null;
	   this.fim = null;
   }
   
   public boolean vazia() {
	   return inicio == null && fim == null;
   }
   
   
   public void adicionarLista(int dado) {
	   No no = new No(dado);
	   if(vazia()) {
		   inicio = no;
		   fim = no;
		   fim.proximo = inicio;
	   } else {
//		   no.proximo = inicio; // Funciona sem esse trecho
		   fim.proximo = no;
		   fim = no;
	   }
	   
   }
   
   public int removerLista() {
	   int removido;
	   
	   if(vazia()) {
		   removido = -1;
	   } else if(inicio == fim) {
		   removido = inicio.dado;
		   inicio = null;
		   fim = null;
	   } else { 
		   removido = inicio.dado; 
//		   fim = inicio; // ERRADO!
		   inicio = inicio.proximo; 
		   fim.proximo = inicio; 
	   }
	   return removido;
   }
   
   public String toString() {
	   String listados = "Numeros" + "\n";
	   int numero = 1;
	   if(vazia()) {
		   return listados = "Lista vazia";
	   } else if(inicio == fim) {
		   listados = listados + numero + "-" + inicio.dado;
	   } else {
		   No noAux = inicio;
		   if(noAux == fim.proximo) {
			   listados = listados + numero + "-" + noAux.dado + "\n";
			   noAux = noAux.proximo;
			   numero++;
		   }
		   while(noAux != fim.proximo) {
			   listados = listados + numero + "-" + noAux.dado + "\n";
			   noAux = noAux.proximo;
			   numero++;
		   }
		   
	   }
	   return listados;
   }
}
