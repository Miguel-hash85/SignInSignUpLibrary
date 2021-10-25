/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Class UserAlreadyExistException that is used when the signUp username it´s already in use.
 * @author Aitor Ruiz de Gauna
 */
public class UserAlreadyExistException extends Exception{
    /**
     * Method getErrorMessage that return the error message.
     * @return String
     */
    public String getErrorMessage(){
        return "The username is already in use,try with another one";
    }
}
