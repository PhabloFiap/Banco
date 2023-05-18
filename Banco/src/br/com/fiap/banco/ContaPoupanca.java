package br.com.fiap.banco;

public class ContaPoupanca {

	private String numero;
	private double saldo;
	private double taxa;
	
	public ContaPoupanca(String numero) {
		this.numero = numero;
	}
	
	public void depositar (double valor) {
		saldo += valor;
		
	}
	public void sacar (double valor) throws ContaPoupancaSaqueException {
		if (valor<valor) {
			throw new ContaPoupancaSaqueException("Conta Poupança nao pode efetuar saque!!");
			
		}
		//saldo -= valor;
		
	}
	

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
}
