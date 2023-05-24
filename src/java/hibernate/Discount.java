package hibernate;
// Generated May 7, 2020 2:41:39 PM by Hibernate Tools 4.3.1

import java.util.HashSet;
import java.util.Set;

/**
 * Discount generated by hbm2java
 */
public class Discount implements java.io.Serializable {

    private Integer id;
    private String name;
    private String count;
    transient private Set products = new HashSet(0);

    public Discount() {
    }

    public Discount(String name, String count, Set products) {
        this.name = name;
        this.count = count;
        this.products = products;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCount() {
        return this.count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Set getProducts() {
        return this.products;
    }

    public void setProducts(Set products) {
        this.products = products;
    }

}