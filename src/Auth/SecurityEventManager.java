/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auth;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ANUJA
 */


public class SecurityEventManager {
    private final List<SecurityObserver> observers = new ArrayList<>();

    public void addObserver(SecurityObserver observer) {
        observers.add(observer);
    }

    public void notify(String event) {
        for (SecurityObserver obs : observers) {
            obs.update(event);
        }
    }
}

