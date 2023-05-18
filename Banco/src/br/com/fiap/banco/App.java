package br.com.fiap.banco;
import javax.management.RuntimeErrorException;

public class App {

	public static void main(String[] args) throws SaldoMenorQueValorException, DepositoNegativoException, ContaPoupancaSaqueException, TransferirMesmaContaException  {

		
		Conta conta = new Conta ("1234-5");
		conta.depositar(10);
		conta.sacar(5);
		
		ContaPoupanca poupanca = new ContaPoupanca("00321-5");
		poupanca.depositar(200);
		
	}

}
