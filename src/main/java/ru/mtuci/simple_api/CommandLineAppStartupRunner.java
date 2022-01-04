package ru.mtuci.simple_api;

import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
import org.springframework.beans.factory.annotation.Autowired;
import ru.mtuci.simple_api.dao.ProductRepository;
import ru.mtuci.simple_api.model.Product;

@Component
public class CommandLineAppStartupRunner implements CommandLineRunner {

    private final ProductRepository productRepository;

    @Autowired
    public CommandLineAppStartupRunner(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void run(String...args) throws Exception {
        System.out.println(productRepository.findById(1L).get());
    }
}
