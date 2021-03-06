/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * Class that defines a SignIn
 * @author Miguel Sánchez
 */
public class SignIn implements Serializable{
    
    private LocalDateTime lastSignIn;
    private int id;
    
    /**
     * This method return the id of the user
     * @return 
     */

    public int getId() {
        return id;
    }
    
    /**
     * This method set the user id
     * @param id 
     */
    public void setId(int id) {
        this.id = id;
    }
    
    /**
     * This method return the last sign in (LocalDateTime)
     * @return 
     */
    public LocalDateTime getLastSignIn() {
        return lastSignIn;
    }
    
    /**
     * This methos set the last sign in (LocalDateTime)
     * @param lastSignIn 
     */
    public void setLastSignIn(LocalDateTime lastSignIn) {
        this.lastSignIn = lastSignIn;
    }
    
    
    
}
