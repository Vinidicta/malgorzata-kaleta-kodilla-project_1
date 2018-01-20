package com.kodilla.good.patterns.firstChallenge.orderExecution;

import com.kodilla.good.patterns.firstChallenge.orderCreator.OrderRequest;

public interface Processor {

    void process(OrderRequest orderRequest);
}
