package exception.custom;

public class BalanceInsufficientException extends RuntimeException{

	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
		}
	}
