package com.kodilla.good.patterns.challenges.first.order.executor;

import com.kodilla.good.patterns.challenges.first.order.creator.OrderRequest;

public interface Processor {

    void process(OrderRequest orderRequest);
}
