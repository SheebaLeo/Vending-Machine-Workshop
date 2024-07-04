package se.lexicon.model;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    @Test
    void testExamine() {
        Product product = new Candy(1, 10.00, "kex", "bar chocolate", false);
        assertEquals("Product id: 1, Product Name: kex, Price: 10.0, Type: bar chocolate, Is Jelly: false", product.examine());
    }

    @Test
    void testUse() {
        Product product = new Drinks(2, 15.0, "7Up", 1.5, true);
        assertEquals("Product Name: 7Up, Quantity: 1.5", product.use());
    }


}
