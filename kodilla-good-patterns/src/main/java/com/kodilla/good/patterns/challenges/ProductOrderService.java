package com.kodilla.good.patterns.challenges;


public class ProductOrderService {

    public void order(final Client client, final OrderRequest orderRequest) {
        System.out.println("New order for client: " + client.getName() + ' ' + client.getSurname() + " was created and consist of: ");
        orderRequest.productsToOrder.showContentsOfList();
        System.out.println("Total amount to be paid: " + orderRequest.productsToOrder.getValueToPay());
        System.out.println("All products will be sent in address " + client.getAdress() + ' ' + client.getPostalCode() + ' ' + client.getCity());
    }
}
