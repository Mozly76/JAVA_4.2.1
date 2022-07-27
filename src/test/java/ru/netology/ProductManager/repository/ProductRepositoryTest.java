package ru.netology.ProductManager.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ru.netology.ProductManager.domain.Book;
import ru.netology.ProductManager.domain.Product;
import ru.netology.ProductManager.domain.Smartphone;

public class ProductRepositoryTest {

    Product product = new Smartphone(11, "G7", 35_000, "LG");
    Product product2 = new Smartphone(22, "S22", 100_000, "Samsung");
    Product product3 = new Book(33, "Приключения Незнайки и его друзей", 500, "Николвй Носов");
    Product product4 = new Book(44, "Приключения Алисы", 600, "Кир Булычев");

    @Test
    public void test() {
        ProductRepository repo = new ProductRepository();
        repo.save(product);
        repo.save(product2);
        repo.save(product3);
        repo.save(product4);
        repo.removeById(product3.getId());

        Product[] expected = {product, product2, product4};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }
}