package edu.AGa.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        try(SessionFactory factory = new Configuration().configure().buildSessionFactory()) {
            try (Session session = factory.openSession()) {
                Product product1 = session.get(Product.class, 239);
                System.out.println(product1);

                String hql = "FROM Product";
                List<Product> products = session.createQuery(hql, Product.class).getResultList();

                for(Product product: products) {
                    System.out.println(product);
                }

                Product product2 = new Product(1323, "Java", 125.67);
                session.persist(product2);
                session.beginTransaction().commit();

            }
        }
    }
}
