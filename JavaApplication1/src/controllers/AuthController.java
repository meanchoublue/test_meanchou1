/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import services.AuthService;
import services.AuthServiceImpl;

/**
 *
 * @author TruongNhuDat
 */
public class AuthController {
    private final AuthService authService;

    public AuthController() {
        this.authService = new AuthServiceImpl();
    }
    
    public boolean login(String username, String password){
        return this.authService.login(username, password);
    }
    
}
