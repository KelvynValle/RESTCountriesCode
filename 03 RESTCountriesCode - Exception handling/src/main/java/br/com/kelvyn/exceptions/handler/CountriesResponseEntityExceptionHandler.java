package br.com.kelvyn.exceptions.handler;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import br.com.kelvyn.exceptions.ExceptionResponseCountries;
import br.com.kelvyn.exceptions.UnknownCodeException;
import br.com.kelvyn.exceptions.UnknownCountryNameException;
import br.com.kelvyn.exceptions.UnknownIsoCodeException;

@RestController
@ControllerAdvice
public class CountriesResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ExceptionResponseCountries> handlerCountriesException(Exception ex,
			WebRequest request) {
		ExceptionResponseCountries exceptionResponse = new ExceptionResponseCountries(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(UnknownCodeException.class)
	public final ResponseEntity<ExceptionResponseCountries> handlerUnknownCodeException(Exception ex,
			WebRequest request) {
		ExceptionResponseCountries exceptionResponse = new ExceptionResponseCountries(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UnknownIsoCodeException.class)
	public final ResponseEntity<ExceptionResponseCountries> handlerUnknownIsoCodeException(Exception ex,
			WebRequest request) {
		ExceptionResponseCountries exceptionResponse = new ExceptionResponseCountries(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(UnknownCountryNameException.class)
	public final ResponseEntity<ExceptionResponseCountries> handlerUnknownCountryNameException(Exception ex,
			WebRequest request) {
		ExceptionResponseCountries exceptionResponse = new ExceptionResponseCountries(new Date(), ex.getMessage(),
				request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.BAD_REQUEST);
	}
}
