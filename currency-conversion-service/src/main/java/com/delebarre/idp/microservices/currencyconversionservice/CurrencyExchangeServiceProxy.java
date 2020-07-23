package com.delebarre.idp.microservices.currencyconversionservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="currency-conversion-service",url="localhost:8000") //to talk to external microsvc
public interface CurrencyExchangeServiceProxy {
    @GetMapping(path="/currency-exchange/from/{from}/to/{to}")
    public CurrencyConversionBean getExchangeValue(@PathVariable("from") String from, @PathVariable("to") String to);

}
