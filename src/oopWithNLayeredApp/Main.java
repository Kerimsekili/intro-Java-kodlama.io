package oopWithNLayeredApp;

import oopWithNLayeredApp.core.logging.DatabaseLogger;
import oopWithNLayeredApp.core.logging.FileLogger;
import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.core.logging.MailLogger;
import oopWithNLayeredApp.dao.jdbc.ProductRepositoryJdbcImpl;
import oopWithNLayeredApp.entities.Product;
import oopWithNLayeredApp.services.ProductServiceImpl;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product1 = new Product(1,"Iphone XR",1000);

        Logger[] loggers = {new DatabaseLogger(),new FileLogger(),new MailLogger()};

        ProductServiceImpl productService = new ProductServiceImpl(new ProductRepositoryJdbcImpl(),loggers);
        productService.add(product1);

    }
}
