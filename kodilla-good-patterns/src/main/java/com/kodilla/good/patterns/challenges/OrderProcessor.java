package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderServiceRepository orderServiceRepository;

    public OrderProcessor(InformationService informationService, ProductOrderService productOrderService, OrderServiceRepository orderServiceRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderServiceRepository = orderServiceRepository;
    }

    public void process(final OrderRequest orderRequest) {

        informationService.inform(orderRequest.getClient());
        productOrderService.order(orderRequest.getClient(), orderRequest);
        orderServiceRepository.createOrder(orderRequest.getClient(), orderRequest.getProductsToOrder());

    }
}
