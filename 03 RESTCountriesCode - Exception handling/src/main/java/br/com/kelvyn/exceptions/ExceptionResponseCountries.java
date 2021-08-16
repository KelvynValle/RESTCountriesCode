package br.com.kelvyn.exceptions;

import java.io.Serializable;
import java.util.Date;
public class ExceptionResponseCountries implements Serializable{
	private static final long serialVersionUID = 1L;

	private Date timestamp;
	private String message;
	private String details;
	
	public ExceptionResponseCountries(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
}
