package br.com.fiap.banco;

public class Conta {

	private String numero;
	private double saldo;
	
	public Conta(String numero) {
		this.numero = numero;
	}
	
	public void depositar (double valor) throws DepositoNegativoException {
		saldo += valor;
		if (valor <=0) {
			throw new DepositoNegativoException ("Deposito menor ou igual a zero");
			
		}

		
	}
	public void sacar (double valor) throws SaldoMenorQueValorException {
		saldo -= valor;
		if (saldo <valor ) {
			throw new SaldoMenorQueValorException("Operação invalida");
	
		}
		
	}
	
	public void transferir (Conta numero, double valor )  throws TransferirMesmaContaException{
		saldo-=valor;
		numero.depositar(valor);
		if ((numero == numero)||saldo<valor) {
			throw new TransferirMesmaContaException ("Operação invalida!!!!!");
			
		}
		
		
		
		
		
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	
}
