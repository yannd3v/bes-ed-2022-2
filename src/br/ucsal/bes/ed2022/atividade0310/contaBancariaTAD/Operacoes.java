package br.ucsal.bes.ed2022.atividade0310.contaBancariaTAD;

public interface Operacoes {
	
	void visualizarSaldo();
	void depositar(double valor);
	void sacar(double valor);
	void atualizar();
}
