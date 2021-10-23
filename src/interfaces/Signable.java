/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 * Interface Signable with the methos to signUp and sigIn.
 * @author Aitor
 */
public interface Signable {
    /**
     * Method signUp that receives a User and throws Exception.
     * @param user
     * @throws Exception 
     */
    public void signUp(User user) throws Exception;
    /**
     * Method signUp that receives a User, returns a User and throws Exception.
     * @param user
     * @return
     * @throws Exception 
     */
    public User signIn(User user) throws Exception;
    
}
