package com.kodilla.good.patterns.challenges.first;

import com.kodilla.good.patterns.challenges.first.order.service.information.MailService;
import com.kodilla.good.patterns.challenges.first.order.creator.OrderRequest;
import com.kodilla.good.patterns.challenges.first.order.creator.ProductOrderService;
import com.kodilla.good.patterns.challenges.first.order.executor.OrderProcessor;
import com.kodilla.good.patterns.challenges.first.order.executor.OrderRequestRetriver;
import com.kodilla.good.patterns.challenges.first.order.repository.ProductOrderRepository;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
