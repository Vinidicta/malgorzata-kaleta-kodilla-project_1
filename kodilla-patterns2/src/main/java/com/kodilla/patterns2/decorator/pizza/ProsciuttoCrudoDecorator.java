package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ProsciuttoCrudoDecorator extends AbstractPizzaDecorator {
    protected ProsciuttoCrudoDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(7));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", prosciutto crudo";
    }
}
