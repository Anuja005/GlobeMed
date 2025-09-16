/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auth;

/**
 *
 * @author ANUJA
 */
public class BasicAccess implements AccessControl {
    protected String username;

    public BasicAccess(String username) {
        this.username = username;
    }

    @Override
    public void accessDashboard() {
        System.out.println("Access for user: " + username);
    }
}