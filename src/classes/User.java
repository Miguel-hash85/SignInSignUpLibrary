/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Class that defines an User
 * @author Miguel Sánchez
 */
public class User implements Serializable{
    
    private Integer id;
    private String login;
    private String email;
    private String fullname;
    private UserStatus status;
    private UserPrivilege privilege;
    private String password;
    private LocalDateTime lastPasswordChange;
    
    /**
     * This method returns the Id of a User (Integer)
     * @return 
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method sets a User Id (Integer)
     * @param id 
     */
    public void setId(Integer id) {
        this.id = id;
    }
    
    /**
     * This method returns the Login of a User (String)
     * @return 
     */
    public String getLogin() {
        return login;
    }
    
    /**
     * This method sets a User Login (String)
     * @param login 
     */
    public void setLogin(String login) {
        this.login = login;
    }
    
    /**
     * This method returns the Email of a User (String)
     * @return 
     */
    
    public String getEmail() {
        return email;
    }
    
    
    /**
     * This method sets a User Email (String)
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * This method returns a User Full name (String)
     * @return 
     */
    

    public String getFullname() {
        return fullname;
    }
    
    /**
     * This method sets a User Full name (String)
     * @param fullname 
     */

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
    
    /**
     * This methid returns a User status (ENABLED or DISABLED)
     * @return 
     */

    public UserStatus getStatus() {
        return status;
    }
    
    /**
     * This method sets a User status (ENABLED or DISABLED)
     * @param status 
     */

    public void setStatus(UserStatus status) {
        this.status = status;
    }
    
    /**
     * This method returns a User privilege (USER or ADMIN)
     * @return 
     */

    public UserPrivilege getPrivilege() {
        return privilege;
    }
    
    /**
     * This method sets a User privilege (USER or ADMIN)
     * @param privilege 
     */

    public void setPrivilege(UserPrivilege privilege) {
        this.privilege = privilege;
    }
    
    /**
     * This methos returns a User Password (String)
     * @return 
     */

    public String getPassword() {
        return password;
    }
    
    /**
     * This method sets a User password (String)
     * @param password 
     */

    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * This method return the last Users password (String)
     * @return 
     */

    public LocalDateTime getLastPasswordChange() {
        return lastPasswordChange;
    }
    
    /**
     * This method sets the last Users password (String)
     * @param lastPasswordChange 
     */

    public void setLastPasswordChange(LocalDateTime lastPasswordChange) {
        this.lastPasswordChange = lastPasswordChange;
    }
    
    /**
     * This method returns a String with all the users attributes.
     * @return 
     */
    
    @Override
    public String toString() {
        return "User{" + "id=" + id + ", login=" + login + ", email=" + email + ", fullname=" + fullname + ", status=" + status + ", privilege=" + privilege + ", password=" + password + ", lastPasswordChange=" + lastPasswordChange + '}';
    }
    
    
    
}
