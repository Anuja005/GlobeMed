/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auth;

/**
 *
 * @author ANUJA
 */
public class AdminNotifierObserver implements SecurityObserver {
    @Override
    public void update(String event) {
        System.out.println("[ADMIN ALERT] " + event);
    }
}
