/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 * Enumeration Message where the values to be transmitted between the server and the client are defined.
 * @author Aitor Ruiz de Gauna
 */
public enum Message {
    SIGNUP,SIGNIN,OK,USER_NOTFOUND,INCORRECT_PASSWORD,EXISTING_USERNAME,CONNECTION_ERROR,LOG_OUT
}
