package se.lexicon.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class VendingMachineImplTest {

    private Product[] products;
    private VendingMachineImpl vendingMachine;

    @BeforeEach
    void setUp() {
        products = new Product[] {
                new Candy( 1,1.5, "Kex", "Bar chocolate", false),
                new Drinks(2, 5.0,"7Up", 2.0, true),
                new Chips( 3,7.0,"Potato chips", "creamy onion", true)
        };
        vendingMachine = new VendingMachineImpl(products);
    }

    @Test
    void testAddCurrency() {
        vendingMachine.addCurrency(10);
        assertEquals(10, vendingMachine.getBalance());
    }

    @Test
    void testRequest() {
        vendingMachine.addCurrency(5);
        Product requestedProduct = vendingMachine.request(2);
        assertNotNull(requestedProduct);
    }

    @Test
    void testRequestInsufficientBalance() {
        vendingMachine.addCurrency(1);
        assertThrows(RuntimeException.class, () -> vendingMachine.request(3));
    }

    @Test
    void testEndSession() {
        vendingMachine.addCurrency(5);
        vendingMachine.endSession();
        assertEquals(0, vendingMachine.getBalance());
    }

    @Test
    void testGetDescriptionProductFound() {
        String description = vendingMachine.getDescription(1);
        assertTrue(description.contains("id: 1"));
    }


    @Test
    void testGetProducts() {
        String[] productDescriptions = vendingMachine.getProducts();
        assertEquals(products.length, productDescriptions.length);
    }
}
