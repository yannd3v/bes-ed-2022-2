package br.ucsal.bes.ed20222.atividade0310.contaBancariaTAD;

public interface Operacoes {
	
	void visualizarSaldo();
	void depositar(double valor);
	void sacar(double valor);
	void atualizar();
}
