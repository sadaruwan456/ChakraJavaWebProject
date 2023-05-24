package hibernate;
// Generated May 7, 2020 2:41:39 PM by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Invoice generated by hbm2java
 */
public class Invoice  implements java.io.Serializable {


     private Integer id;
     private Customer customer;
     private Date date;
     private Double total;
     private Set invoiceItems = new HashSet(0);

    public Invoice() {
    }

	
    public Invoice(Customer customer) {
        this.customer = customer;
    }
    public Invoice(Customer customer, Date date, Double total, Set invoiceItems) {
       this.customer = customer;
       this.date = date;
       this.total = total;
       this.invoiceItems = invoiceItems;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Customer getCustomer() {
        return this.customer;
    }
    
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Date getDate() {
        return this.date;
    }
    
    public void setDate(Date date) {
        this.date = date;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public Set getInvoiceItems() {
        return this.invoiceItems;
    }
    
    public void setInvoiceItems(Set invoiceItems) {
        this.invoiceItems = invoiceItems;
    }




}


