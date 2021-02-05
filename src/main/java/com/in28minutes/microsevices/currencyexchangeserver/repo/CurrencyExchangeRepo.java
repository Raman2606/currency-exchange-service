package com.in28minutes.microsevices.currencyexchangeserver.repo;

import org.springframework.data.repository.CrudRepository;

import com.in28minutes.microsevices.currencyexchangeserver.bean.CurrencyExchange;

public interface CurrencyExchangeRepo extends CrudRepository<CurrencyExchange, Long>{
	
	public CurrencyExchange findByFromAndTo(String from, String to);
	
	

}
