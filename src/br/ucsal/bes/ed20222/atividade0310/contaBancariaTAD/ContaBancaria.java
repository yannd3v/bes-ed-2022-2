package br.ucsal.bes.ed20222.atividade0310.contaBancariaTAD;

public class ContaBancaria implements Operacoes{
	
	private double saldo;
	
	private double getSaldo() {
		return saldo;
	}

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void visualizarSaldo() {
		System.out.println(getSaldo());
	}

	@Override
	public void depositar(double valor) {
		if(getSaldo() + valor < 0 || valor < 0) {
			System.err.println("NÃO FOI POSSÍVEL DEPOSITAR");
		} else {
			setSaldo(getSaldo() + valor);
		}
		
	}

	@Override
	public void sacar(double valor) {
		if(getSaldo() - valor < 0 || valor < 0) {
			System.err.println("NÃO FOI POSSÍVEL SACAR");
		} else {
			setSaldo(getSaldo() - valor);
		}
		visualizarSaldo();
	}

	@Override
	public void atualizar() {
		System.err.println("ATUALIZADO");
	}
	
	
}
