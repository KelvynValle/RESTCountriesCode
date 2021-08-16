package br.com.kelvyn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.kelvyn.exceptions.UnknownCodeException;
import br.com.kelvyn.exceptions.UnknownCountryNameException;
import br.com.kelvyn.exceptions.UnknownIsoCodeException;

@RestController
public class BadUrlExceptionController {
	// COUNTRY QUERIES EXCEPTION HANDLERS
	// null code handler
	@RequestMapping(value = "/country/code/", method = RequestMethod.GET)
	public void countryNameByNullCode() throws Exception {
		throw new UnknownCodeException("Unknown country code.");
	}

	// null iso handler
	@RequestMapping(value = "/country/iso/", method = RequestMethod.GET)
	public void countryNameByNullIsoCode() throws Exception {
		throw new UnknownIsoCodeException("Unknown ISO country code.");
	}

	// ISO QUERIES EXCEPTION HANDLERS
	// null country name
	@RequestMapping(value = "/iso/country/", method = RequestMethod.GET)
	public void isoCodeByNullCountryName() throws Exception {
		throw new UnknownCountryNameException("Unknown country name.");
	}

	// null code
	@RequestMapping(value = "/iso/code/", method = RequestMethod.GET)
	public void getIsoCodeByNullCountryCode() throws Exception {
		throw new UnknownCodeException("Unknown country code.");
	}

	// CODE QUERIES EXCEPTION HANDLERS
	// null country
	@RequestMapping(value = "/code/country/", method = RequestMethod.GET)
	public void getCodeByNullCountryName() throws Exception {
		throw new UnknownCountryNameException("Unknown country name.");
	}

	// null iso code
	@RequestMapping(value = "/code/iso/", method = RequestMethod.GET)
	public void getCodeByNullIsoCode() throws Exception {
		throw new UnknownIsoCodeException("Unknown ISO country code.");
	}
}
