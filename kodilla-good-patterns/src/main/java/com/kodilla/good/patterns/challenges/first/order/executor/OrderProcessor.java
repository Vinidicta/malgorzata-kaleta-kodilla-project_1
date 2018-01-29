package com.kodilla.good.patterns.challenges.first.order.executor;

import com.kodilla.good.patterns.challenges.first.order.service.information.InformationService;
import com.kodilla.good.patterns.challenges.first.order.creator.OrderRequest;
import com.kodilla.good.patterns.challenges.first.order.creator.ProductOrderService;
import com.kodilla.good.patterns.challenges.first.order.repository.OrderServiceRepository;

public class OrderProcessor implements Processor {

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
