package oopWithNLayeredApp.dao.hibernate;

import oopWithNLayeredApp.dao.ProductRepository;
import oopWithNLayeredApp.entities.Product;

public class ProductRepositoryHibernateImpl implements ProductRepository {
    public void add(Product product){
        System.out.println("Hibernate ile Veritabanına eklendi.");
    }
}
