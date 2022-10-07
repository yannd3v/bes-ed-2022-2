package br.ucsal.bes.ed2022.atividade0310.contaBancariaTAD;
public class ContaMain {

	public static void main(String[] args) {
		ContaBancaria conta1 = new ContaBancaria();
		conta1.visualizarSaldo();
		conta1.depositar(0);
		conta1.visualizarSaldo();
		conta1.depositar(30);
		conta1.visualizarSaldo();
		conta1.depositar(20);
		conta1.visualizarSaldo();
		conta1.sacar(0.005);
		conta1.visualizarSaldo();
		conta1.atualizar();

	}

}
