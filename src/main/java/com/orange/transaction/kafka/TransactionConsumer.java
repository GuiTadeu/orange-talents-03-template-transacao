package com.orange.transaction.kafka;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@FeignClient(name = "transactions", url = "http://localhost:7777/api/cartoes")
public interface TransactionConsumer {

    @RequestMapping(method = RequestMethod.POST, consumes = "application/json")
    void start(@Valid @RequestBody StartConsumerRequest request);

    @RequestMapping(method = RequestMethod.DELETE, value = "/{cardNumber}", consumes = "application/json")
    void stop(@PathVariable String cardNumber);
}
