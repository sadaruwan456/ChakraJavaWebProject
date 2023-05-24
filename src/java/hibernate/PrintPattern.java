package hibernate;
// Generated May 7, 2020 2:41:39 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * PrintPattern generated by hbm2java
 */
public class PrintPattern  implements java.io.Serializable {


     private Integer id;
     private String name;
     transient private Set products = new HashSet(0);

    public PrintPattern() {
    }

    public PrintPattern(String name, Set products) {
       this.name = name;
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
    public Set getProducts() {
        return this.products;
    }
    
    public void setProducts(Set products) {
        this.products = products;
    }




}


