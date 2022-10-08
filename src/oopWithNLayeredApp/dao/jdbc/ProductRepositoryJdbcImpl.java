package oopWithNLayeredApp.dao.jdbc;

import oopWithNLayeredApp.dao.ProductRepository;
import oopWithNLayeredApp.entities.Product;

public class ProductRepositoryJdbcImpl implements ProductRepository {

    @Override
    public void add(Product product) {
        System.out.println("JDBC ile Veritabanına eklendi.");
    }
}
