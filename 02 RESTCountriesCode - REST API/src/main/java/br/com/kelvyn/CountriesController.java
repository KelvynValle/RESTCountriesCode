package br.com.kelvyn;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountriesController {
	private static DataSources dataSource = new DataSources();

	// GETTING COUNTRY NAMES
	// get country name by country code
	@RequestMapping(value = "/countryName/countryCode/{code}", method = RequestMethod.GET)
	public String getCountryNameByCountryCode(@PathVariable("code") String code) throws Exception {
		if (code == "" || code == null) {
			throw new Exception();
		}
		return dataSource.getCountryNameByCode(code);
	}

	// get country name by country iso code
	@RequestMapping(value = "/countryName/countryIsoCode/{isoCode}", method = RequestMethod.GET)
	public String getCountryNameByCountryIsoCode(@PathVariable("isoCode") String isoCode) throws Exception {
		if (isoCode == "" || isoCode == null) {
			throw new Exception();
		}
		return dataSource.getCountryNameByIsoCode(isoCode);
	}

	// GETTING ISO CODES
	// get country iso code by country name
	@RequestMapping(value = "/isoCode/countryName/{name}", method = RequestMethod.GET)
	public String getIsoCodeByCountryName(@PathVariable("name") String name) throws Exception {
		if (name == "" || name == null) {
			throw new Exception();
		}
		return dataSource.getIsoCodeByCountryName(name);
	}

	// get country iso code by country code
	@RequestMapping(value = "/isoCode/countryCode/{code}", method = RequestMethod.GET)
	public String getIsoCodeByCountryCode(@PathVariable("code") String code) throws Exception {
		if (code == "" || code == null) {
			throw new Exception();
		}
		return dataSource.getIsoCodeByCode(code);
	}

	// GETTING COUNTRY CODES
	// get country code by country name
	@RequestMapping(value = "/countryCode/countryName/{name}", method = RequestMethod.GET)
	public String getCountryCodeByCountryName(@PathVariable("name") String name) throws Exception {
		if (name == "" || name == null) {
			throw new Exception();
		}
		return dataSource.getCodeByCountryName(name);
	}

	// get country code by iso code
	@RequestMapping(value = "/countryCode/isoCode/{code}", method = RequestMethod.GET)
	public String getCountryCodeByIsoCode(@PathVariable("code") String code) throws Exception {
		if (code == "" || code == null) {
			throw new Exception();
		}
		return dataSource.getCodeByIsoCode(code);
	}
}
