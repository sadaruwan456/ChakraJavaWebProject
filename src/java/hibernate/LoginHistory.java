package hibernate;
// Generated May 7, 2020 2:41:39 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * LoginHistory generated by hbm2java
 */
public class LoginHistory  implements java.io.Serializable {


     private int id;
     private Admin admin;
     private LogStatus logStatus;
     private Date dateTime;

    public LoginHistory() {
    }

	
    public LoginHistory(int id, Admin admin, LogStatus logStatus) {
        this.id = id;
        this.admin = admin;
        this.logStatus = logStatus;
    }
    public LoginHistory(int id, Admin admin, LogStatus logStatus, Date dateTime) {
       this.id = id;
       this.admin = admin;
       this.logStatus = logStatus;
       this.dateTime = dateTime;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public Admin getAdmin() {
        return this.admin;
    }
    
    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
    public LogStatus getLogStatus() {
        return this.logStatus;
    }
    
    public void setLogStatus(LogStatus logStatus) {
        this.logStatus = logStatus;
    }
    public Date getDateTime() {
        return this.dateTime;
    }
    
    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }




}


