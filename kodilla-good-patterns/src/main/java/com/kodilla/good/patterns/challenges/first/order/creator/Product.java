package com.kodilla.good.patterns.challenges.first.order.creator;

public final class Product {

    private final String productName;
    private final double productPrice;
    private final double quantity;

    public Product(final String productName, final double productPrice, double quantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getProdutPrice() {
        return productPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getValue() {
        return productPrice * quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;

        Product product = (Product) o;

        return productName.equals(product.productName);
    }

    @Override
    public int hashCode() {
        return productName.hashCode();
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", quantity=" + quantity +
                '}';
    }
}
