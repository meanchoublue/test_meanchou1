/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author TruongNhuDat
 */
public class AuthServiceImpl implements AuthService{

    @Override
    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("123456");
    }

    @Override
    public boolean register(String username, String password) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
