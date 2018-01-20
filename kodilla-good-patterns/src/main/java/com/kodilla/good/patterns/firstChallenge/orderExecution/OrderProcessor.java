package com.kodilla.good.patterns.firstChallenge.orderExecution;

import com.kodilla.good.patterns.firstChallenge.informationService.InformationService;
import com.kodilla.good.patterns.firstChallenge.orderCreator.OrderRequest;
import com.kodilla.good.patterns.firstChallenge.orderCreator.ProductOrderService;
import com.kodilla.good.patterns.firstChallenge.orderRepository.OrderServiceRepository;

public class OrderProcessor implements Processor{

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderServiceRepository orderServiceRepository;

    public OrderProcessor(InformationService informationService, ProductOrderService productOrderService, OrderServiceRepository orderServiceRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderServiceRepository = orderServiceRepository;
    }

    @Override
    public void process(final OrderRequest orderRequest) {
        informationService.inform(orderRequest.getClient());
        productOrderService.order(orderRequest.getClient(), orderRequest);
        orderServiceRepository.createOrder(orderRequest.getClient(), orderRequest.getOrder());

    }
}
