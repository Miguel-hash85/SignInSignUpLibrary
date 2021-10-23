/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

/**
 *
 * @author Aitor
 */
public interface Signable {

    public void signUp(User user) throws Exception;
    public User signIn(User user) throws Exception;
    
}
