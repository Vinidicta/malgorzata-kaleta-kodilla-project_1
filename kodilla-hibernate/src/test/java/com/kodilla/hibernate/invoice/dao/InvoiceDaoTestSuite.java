package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
public class InvoiceDaoTestSuite {
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("Orange");
        Product product2 = new Product("Carrot");
        List<Item> itemsList1 = new ArrayList();
        Invoice invoice1 = new Invoice("01/03/18", itemsList1);

        Item item1 = new Item(product1, new BigDecimal(2.50), 3);
        Item item2 = new Item(product2, new BigDecimal(1.50), 5);

        itemsList1.add(item1);
        itemsList1.add(item2);

        //when
        productDao.save(product1);
        productDao.save(product2);
        itemDao.save(item1);
        itemDao.save(item2);
        invoiceDao.save(invoice1);

        //then
        Long invoiceId = invoice1.getId();
        Long productId1 = product1.getId();
        Long productId2 = product2.getId();
        Long itemId1 = item1.getId();
        Long itemId2 = item2.getId();

        Invoice invoice = invoiceDao.findById(invoiceId);
        Assert.assertEquals(invoice1, invoice);

        //clean up
        productDao.delete(productId1);
        productDao.delete(productId2);
        itemDao.delete(itemId1);
        itemDao.delete(itemId2);
        invoiceDao.delete(invoiceId);
    }
}
