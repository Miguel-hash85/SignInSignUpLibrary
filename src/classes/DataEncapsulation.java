/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.Serializable;

/**
 * Class DataEncapsulation that contains the info that is transmitted between server and client.
 * @author Aitor
 */
public class DataEncapsulation implements Serializable{
   
    private User user;
    private Message message;
    /**
     * Method getUser where the user of the class is returned.
     * @return User
     */
    public User getUser() {
        return user;
    }
    /**
     * Method setUser where the received User value is set to the class User. 
     * @param user 
     */
    public void setUser(User user) {
        this.user = user;
    }
    /**
     * Method getMessage where the message of the class is returned.
     * @return Message
     */
    public Message getMessage() {
        return message;
    }
    /**
     * Method setMessage where the received Message value is set to the class Message. 
     * @param message 
     */
    public void setMessage(Message message) {
        this.message = message;
    }
    
    
}
