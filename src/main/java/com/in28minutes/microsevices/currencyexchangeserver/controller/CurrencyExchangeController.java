package com.in28minutes.microsevices.currencyexchangeserver.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microsevices.currencyexchangeserver.bean.CurrencyExchange;
import com.in28minutes.microsevices.currencyexchangeserver.repo.CurrencyExchangeRepo;

@RestController
public class CurrencyExchangeController {

	@Autowired
	Environment environment;
	
	@Autowired
	CurrencyExchangeRepo currencyExchangeRepo;
	
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange getexchangeRate(@PathVariable String from, @PathVariable String to) {
	CurrencyExchange ceValue;
		Optional<CurrencyExchange> ce = Optional.ofNullable(currencyExchangeRepo.findByFromAndTo(from, to)); 
		ce.ifPresent(exc->exc.setEnvironment(environment.getProperty("local.server.port")));
		ceValue = ce.orElse(new CurrencyExchange());
		return ceValue;
	}
}