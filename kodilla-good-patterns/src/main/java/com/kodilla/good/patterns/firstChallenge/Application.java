package com.kodilla.good.patterns.firstChallenge;

import com.kodilla.good.patterns.firstChallenge.informationService.MailService;
import com.kodilla.good.patterns.firstChallenge.orderCreator.OrderRequest;
import com.kodilla.good.patterns.firstChallenge.orderCreator.ProductOrderService;
import com.kodilla.good.patterns.firstChallenge.orderExecution.OrderProcessor;
import com.kodilla.good.patterns.firstChallenge.orderExecution.OrderRequestRetriver;
import com.kodilla.good.patterns.firstChallenge.orderRepository.ProductOrderRepository;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
