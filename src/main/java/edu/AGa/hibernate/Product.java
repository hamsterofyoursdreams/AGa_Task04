package edu.AGa.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Product", schema = "Production")
public class Product {
    @Id
    @Column(name = "Product")
    private int productId;
    private String name;
    private double listPrice;

    public Product(int productId, String name, double listPrice) {
        this.productId = productId;
        this.name = name;
        this.listPrice = listPrice;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getListPrice() {
        return listPrice;
    }

    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }

    @Override
    public String toString() {
        return "{ProductId: " + this.getProductId() + ", Name: " + this.getName() + ", ListPrice: " + this.getListPrice() + "}";
    }
}
