package br.com.dio.dao.Exception;

public class UserNotFoundException extends RuntimeException {
	
	public UserNotFoundException(final String message) {
		super(message);
	}
	

}
