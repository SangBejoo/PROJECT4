package pojo;
// Generated Oct 12, 2022 12:23:08 AM by Hibernate Tools 4.3.1



/**
 * Staff generated by hbm2java
 */
public class Staff  implements java.io.Serializable {


     private Integer id;
     private String name;
     private String email;
     private String password;

    public Staff() {
    }

    public Staff(String name, String email, String password) {
       this.name = name;
       this.email = email;
       this.password = password;
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
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}

