package br.com.fiap.banco;
import java.security.MessageDigest;
public class DepositoNegativoException extends RuntimeException {
	public DepositoNegativoException (String message) {
		super(message);
		
	}

}
