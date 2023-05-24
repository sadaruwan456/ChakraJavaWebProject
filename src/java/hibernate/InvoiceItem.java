package hibernate;
// Generated May 7, 2020 2:41:39 PM by Hibernate Tools 4.3.1



/**
 * InvoiceItem generated by hbm2java
 */
public class InvoiceItem  implements java.io.Serializable {


     private Integer id;
     private Delivery delivery;
     private Invoice invoice;
     private Product product;
     private Integer qty;

    public InvoiceItem() {
    }

	
    public InvoiceItem(Delivery delivery, Invoice invoice, Product product) {
        this.delivery = delivery;
        this.invoice = invoice;
        this.product = product;
    }
    public InvoiceItem(Delivery delivery, Invoice invoice, Product product, Integer qty) {
       this.delivery = delivery;
       this.invoice = invoice;
       this.product = product;
       this.qty = qty;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public Delivery getDelivery() {
        return this.delivery;
    }
    
    public void setDelivery(Delivery delivery) {
        this.delivery = delivery;
    }
    public Invoice getInvoice() {
        return this.invoice;
    }
    
    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
    public Product getProduct() {
        return this.product;
    }
    
    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getQty() {
        return this.qty;
    }
    
    public void setQty(Integer qty) {
        this.qty = qty;
    }




}

