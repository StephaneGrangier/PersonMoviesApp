package ch.hearc.ig.odi.personmoviesapp.exception;

public class PersonException extends Exception{

	public PersonException() {
            super();
	}

	/**
	 * 
	 * @param message
	 */
	public PersonException(String message) {
            super(message);
	}

	/**
	 * 
	 * @param message
	 * @param cause
	 */
	public PersonException(String message, Throwable cause) {
            super(message, cause);
	}

}