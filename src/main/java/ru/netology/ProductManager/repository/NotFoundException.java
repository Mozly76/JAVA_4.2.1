package ru.netology.ProductManager.repository;

public class NotFoundException extends RuntimeException {

    public NotFoundException(String s) {
        super(s);
    }
}