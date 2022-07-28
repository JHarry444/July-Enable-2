package com.qa.objects.person;

public class PersonNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4374212187533292407L;

	public PersonNotFoundException(String message) {
		super(message);
	}

}
