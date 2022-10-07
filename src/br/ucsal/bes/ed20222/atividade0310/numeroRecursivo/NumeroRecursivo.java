package br.ucsal.bes.ed20222.atividade0310.numeroRecursivo;

public class NumeroRecursivo {

	public static void main(String[] args) {
		System.out.println(numeroR(4));
	}
	
	public static int numeroR(int num) {
		if(num == 0) {
			return 0;
		}
		return num + numeroR(num-1);
	}

}
