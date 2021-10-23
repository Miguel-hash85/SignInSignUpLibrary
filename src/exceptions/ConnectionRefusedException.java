/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 * Class ConnectionRefusedException that is used when the connection with the server fails.
 * @author Aitor Ruiz de Gauna Calvo,Miguel Sánchez
 */
public class ConnectionRefusedException extends Exception{
    /**
     * Method getErrorMessage that return the error message.
     * @return String
     */
    public String getErrorMessage(){
        return "Connection with the server refused,try later";
    }
}
