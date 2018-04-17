package com.kodilla.patterns2.decorator.pizza;

import static org.junit.Assert.*;

import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testBasicPizzaWithSalame() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new SalameDecorator(pizza);
        //When
        BigDecimal totalCost = pizza.getCost();
        String description = pizza.getDescription();
        //Then
        assertEquals(new BigDecimal(20), totalCost);
        assertEquals("Pizza dough, tomato sos, mozzarella, olive oil, salame", description);
    }

    @Test
    public void testBasicPizzaWithProsciuttoArugulaAndExtraCheese() {
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new ProsciuttoCrudoDecorator(pizza);
        pizza = new ArugulaDecorator(pizza);
        pizza = new ExtraCheeseDecorator(pizza);
        //When
        BigDecimal totalCost = pizza.getCost();
        String description = pizza.getDescription();
        //Then
        assertEquals(new BigDecimal(30), totalCost);
        assertEquals("Pizza dough, tomato sos, mozzarella, olive oil, prosciutto crudo, arugula, extra cheese",
                description);
    }
}
