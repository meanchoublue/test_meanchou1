/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package services;

/**
 *
 * @author TruongNhuDat
 */
public interface AuthService {
    public boolean login(String username, String password);
    public boolean register(String username, String password);
}
