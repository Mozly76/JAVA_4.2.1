package ru.netology.ProductManager.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {
    @Test
    public void shouldSetAuthor() {
        Book book = new Book();
        book.setAuthor("Николвй Носов");

        String expected = "Николвй Носов";
        String actual = book.getAuthor();

        assertEquals(expected, actual);
    }
}