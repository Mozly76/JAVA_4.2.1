package ru.netology.ProductManager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void shouldSetId() {
        Product product = new Product();
        product.setId(11);

        int expected = 11;
        int actual = product.getId();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetName() {
        Product product = new Product();
        product.setName("G7");

        String expected = "G7";
        String actual = product.getName();

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrice() {
        Product product = new Product();
        product.setPrice(35_000);

        int expected = 35_000;
        int actual = product.getPrice();

        assertEquals(expected, actual);
    }
}