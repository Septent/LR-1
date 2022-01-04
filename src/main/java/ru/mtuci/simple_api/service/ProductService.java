package ru.mtuci.simple_api.service;

import ru.mtuci.simple_api.model.Product;

import java.util.List;

public interface ProductService {
    Product get(Long id);

    List<Product> getAll();

    Product save(Product product);

    void delete(Long id);
}
