/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Class UserNotFoundException that is used when the signIn username it´s not found.
 * @author Aitor Ruiz de Gauna
 */
public class UserNotFoundException extends Exception{
     /**
     * Method getErrorMessage that return the error message.
     * @return String
     */
    public String getErrorMessage(){
        return "User not found";
    }
}
