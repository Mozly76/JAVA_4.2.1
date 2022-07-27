package ru.netology.ProductManager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SmartphoneTest {
    @Test
    public void shouldSetManufacturer() {
        Smartphone smartphone = new Smartphone();
        smartphone.setManufacturer("LG");

        String expected = "LG";
        String actual = smartphone.getManufacturer();

        assertEquals(expected, actual);
    }
}