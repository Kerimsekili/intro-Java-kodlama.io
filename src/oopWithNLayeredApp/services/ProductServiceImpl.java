package oopWithNLayeredApp.services;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dao.ProductRepository;
import oopWithNLayeredApp.entities.Product;

public class ProductServiceImpl {

    private ProductRepository productRepository;
    private Logger[] loggers;

    public ProductServiceImpl(ProductRepository productRepository,Logger[] loggers) {
        this.productRepository = productRepository;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        if (product.getUnitPrice()<10){
            throw new Exception("Ürün fiyatı 10'dan küçük olamaz !");
        }
        productRepository.add(product);

        for (Logger logger : loggers) {
            logger.log(product.getName());
        }
    }
}
