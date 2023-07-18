package com.workshop.mongodb.services.excepition;

public class ObjectNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6528076461460547365L;
	

	public ObjectNotFoundException(String msg) {
		super(msg);
	}
}
