package com.suhail.microservices.currencyexchangeservice.currencyconversionservice.currencyconversionservice;

import feign.hystrix.FallbackFactory;

public class CurrencyExchangeClientFallbackFactory implements FallbackFactory<CurrencyExchangeServiceProxy> {

	@Override
	public CurrencyExchangeServiceProxy create(Throwable throwable) {
		// TODO Auto-generated method stub
		 return new CurrencyExchangeClientFallback(throwable);
	}

}
