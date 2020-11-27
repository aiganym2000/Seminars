package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login{
    public static void checkAll(String login, String password, String confirmPassword) {
        checkLogin(login);
        checkPassword(password, confirmPassword);
    }

    public static boolean checkLogin(String login){
        final String loginRegex = "[\\w]{1,20}";
        try{
            if(!login.matches(loginRegex)){
                throw new WrongLoginException();
            }
        } catch (WrongLoginException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }

    public static boolean checkPassword(String password, String confirmPassword){
        final String loginRegex = "[\\w]{1,20}";
        try{
            if(!password.matches(loginRegex) || !password.equals(confirmPassword)){
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException e){
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
