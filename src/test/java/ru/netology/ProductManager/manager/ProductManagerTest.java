package ru.netology.ProductManager.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.ProductManager.domain.Book;
import ru.netology.ProductManager.domain.Product;
import ru.netology.ProductManager.domain.Smartphone;
import ru.netology.ProductManager.repository.ProductRepository;


public class ProductManagerTest {
    private ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);
    Product product1 = new Smartphone(11, "G7", 35_000, "LG");
    Product product2 = new Smartphone(22, "S22", 100_000, "Samsung");
    Product product3 = new Book(33, "Приключения Незнайки и его друзей", 500, "Николвй Носов");
    Product product4 = new Book(44, "Приключения Алисы", 600, "Кир Булычев");

    @BeforeEach
    public void setup() {
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(product4);
    }

    @Test
    public void shouldAdd() {

        Product[] expected = {product1, product2, product3, product4};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchBy() {
        String name = "S22";
        Product[] expected = {product2};
        Product[] actual = manager.searchBy(name);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchWhenFewProductsSuit() {
        String name = "Приключения";
        Product[] expected = {product3, product4};
        Product[] actual = manager.searchBy(name);

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchWhenProductsNotSuit() {
        String name = "iPhone";
        Product[] expected = {};
        Product[] actual = manager.searchBy(name);

        assertArrayEquals(expected, actual);
    }
}