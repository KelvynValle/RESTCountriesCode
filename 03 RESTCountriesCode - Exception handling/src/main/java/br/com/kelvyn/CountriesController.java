package br.com.kelvyn;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.kelvyn.exceptions.UnknownCodeException;
import br.com.kelvyn.exceptions.UnknownCountryNameException;
import br.com.kelvyn.exceptions.UnknownIsoCodeException;

@RestController
public class CountriesController {
	private static DataSources dataSource = new DataSources();

	// GETTING COUNTRY NAMES
	// get country name by country code
	@RequestMapping(value = "/country/code/{code}", method = RequestMethod.GET)
	public String getCountryNameByCode(@PathVariable("code") String code) throws Exception {
		String countryName = dataSource.getCountryNameByCode(code);
		return countryName;
	}

	// get country name by country iso code
	@RequestMapping(value = "/country/iso/{isoCode}", method = RequestMethod.GET)
	public String getCountryNameByIsoCode(@PathVariable("isoCode") String isoCode) throws Exception {
		if (isoCode == "" || isoCode == null) {
			throw new UnknownIsoCodeException("Unknown ISO country code.");
		}
		return dataSource.getCountryNameByIsoCode(isoCode);
	}

	// GETTING ISO CODES
	// get country iso code by country name
	@RequestMapping(value = "/iso/country/{name}", method = RequestMethod.GET)
	public String getIsoCodeByCountryName(@PathVariable("name") String name) throws Exception {
		if (name == "" || name == null) {
			throw new UnknownCountryNameException("Unknown country name.");
		}
		return dataSource.getIsoCodeByCountryName(name);
	}

	// get country iso code by country code
	@RequestMapping(value = "/iso/code/{code}", method = RequestMethod.GET)
	public String getIsoCodeByCountryCode(@PathVariable("code") String code) throws Exception {
		if (code == "" || code == null) {
			throw new UnknownCodeException("Unknown country code.");
		}
		return dataSource.getIsoCodeByCode(code);
	}

	// GETTING COUNTRY CODES
	// get country code by country name
	@RequestMapping(value = "/code/country/{name}", method = RequestMethod.GET)
	public String getCodeByCountryName(@PathVariable("name") String name) throws Exception {
		if (name == "" || name == null) {
			throw new UnknownCountryNameException("Unknown country name.");
		}
		return dataSource.getCodeByCountryName(name);
	}

	// get country code by iso code
	@RequestMapping(value = "/code/iso/{code}", method = RequestMethod.GET)
	public String getCodeByIsoCode(@PathVariable("code") String code) throws Exception {
		if (code == "" || code == null) {
			throw new UnknownIsoCodeException("Unknown ISO country code.");
		}
		return dataSource.getCodeByIsoCode(code);
	}

}
