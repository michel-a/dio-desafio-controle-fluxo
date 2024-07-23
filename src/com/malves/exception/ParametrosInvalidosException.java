package com.malves.exception;

public class ParametrosInvalidosException extends Exception {

	private static final long serialVersionUID = 1L;

	public ParametrosInvalidosException() {
		super();
	}

	public ParametrosInvalidosException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ParametrosInvalidosException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParametrosInvalidosException(String message) {
		super(message);
	}

	public ParametrosInvalidosException(Throwable cause) {
		super(cause);
	}

}
