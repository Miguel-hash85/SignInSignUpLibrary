/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Class  IncorrectPasswordException that is used when the password of the signIn it´s incorrect.
 * @author Aitor Ruiz de Gauna Calvo,Miguel Sánchez
 */
public class IncorrectPasswordException extends Exception{
    /**
     * Method getErrorMessage that return the error message.
     * @return String
     */
    @Override
    public String getMessage(){
        return "The password is incorrect";
    }
}
