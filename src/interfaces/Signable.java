/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import classes.User;
import exceptions.ConnectionRefusedException;
import exceptions.IncorrectPasswordException;
import exceptions.UserAlreadyExistException;
import exceptions.UserNotFoundException;

/**
 * Interface Signable with the methos to signUp and sigIn.
 * @author Aitor Ruiz de Gauna
 */
public interface Signable {
    /**
     * Method signUp that receives a User and throws Exception.
     * @param user
     * @throws Exception 
     * @throws exceptions.UserAlreadyExistException 
     * @throws exceptions.ConnectionRefusedException 
     */
    public void signUp(User user) throws Exception,UserAlreadyExistException,ConnectionRefusedException;
    /**
     * Method signUp that receives a User, returns a User and throws Exception.
     * @param user
     * @return
     * @throws Exception 
     * @throws exceptions.UserNotFoundException 
     * @throws exceptions.IncorrectPasswordException 
     * @throws exceptions.ConnectionRefusedException 
     */
    public User signIn(User user) throws Exception,UserNotFoundException,IncorrectPasswordException,ConnectionRefusedException;
    
}
