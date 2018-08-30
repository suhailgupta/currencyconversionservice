package com.suhail.microservices.currencyexchangeservice.currencyconversionservice.currencyconversionservice;

import feign.FeignException;

public class CurrencyExchangeClientFallback implements CurrencyExchangeServiceProxy {

    private final Throwable cause;

    public CurrencyExchangeClientFallback(Throwable cause) {
      this.cause = cause;
    }

	@Override
	public CurrencyConversionBean retrieveExchangeValue(String from, String to) {
		 if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
	            // Treat the HTTP 404 status
			 
	        }
		return null;
	}

   /* @Override
    public List<?> suggest(ViewingHistory history) {
        if (cause instanceof FeignException && ((FeignException) cause).status() == 404) {
            // Treat the HTTP 404 status
        }

        return new ArrayList<>();
    }*/

}
