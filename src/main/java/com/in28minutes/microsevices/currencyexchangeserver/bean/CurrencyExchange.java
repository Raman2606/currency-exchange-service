package com.in28minutes.microsevices.currencyexchangeserver.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CurrencyExchange {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "\"from\"")
	private String from;
	private String to;
	private BigDecimal conversionMultiplpe;
	private String environment;
	
	public CurrencyExchange() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiplpe() {
		return conversionMultiplpe;
	}
	public void setConversionMultiplpe(BigDecimal conversionMultiplpe) {
		this.conversionMultiplpe = conversionMultiplpe;
	}
	
	public String getEnvironment() {
		return environment;
	}
	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	public CurrencyExchange(Long id, String from, String to, BigDecimal conversionMultiplpe) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMultiplpe = conversionMultiplpe;
	}
	public CurrencyExchange(String from, String to, BigDecimal conversionMultiplpe) {
		super();
		this.from = from;
		this.to = to;
		this.conversionMultiplpe = conversionMultiplpe;
	}
	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", from=" + from + ", to=" + to + ", conversionMultiplpe="
				+ conversionMultiplpe + ", environment=" + environment + "]";
	}
	
	

}
