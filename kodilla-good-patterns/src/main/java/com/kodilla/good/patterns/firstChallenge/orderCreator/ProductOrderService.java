package com.kodilla.good.patterns.firstChallenge.orderCreator;


public class ProductOrderService implements OrderService {

    @Override
    public void order(final Client client, final OrderRequest orderRequest) {
        System.out.println("New order for client: " + client.getName() + ' ' + client.getSurname() + " was created and consist of: ");
        orderRequest.order.showContentsOfList();
        System.out.println("Total amount to be paid: " + orderRequest.order.getValueToPay());
        System.out.println("All products will be sent in address " + client.getAdress() + ' ' + client.getPostalCode() + ' ' + client.getCity());
    }
}
