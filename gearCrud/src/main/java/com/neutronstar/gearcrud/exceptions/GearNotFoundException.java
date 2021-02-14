package com.neutronstar.gearcrud.exceptions;

public class GearNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;

	public GearNotFoundException(String exception) {
		super(exception);
	}

}
