package hibernate;
// Generated May 7, 2020 2:41:39 PM by Hibernate Tools 4.3.1



/**
 * RatingMathod generated by hbm2java
 */
public class RatingMathod  implements java.io.Serializable {


     private int id;
     private String name;

    public RatingMathod() {
    }

	
    public RatingMathod(int id) {
        this.id = id;
    }
    public RatingMathod(int id, String name) {
       this.id = id;
       this.name = name;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }




}


