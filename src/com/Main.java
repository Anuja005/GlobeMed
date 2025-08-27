/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com;

import com.formdev.flatlaf.themes.FlatMacLightLaf;
import gui.LoginFrame;

/**
 *
 * @author ANUJA
 */
public class Main {
    public static void main(String[] args) {
         FlatMacLightLaf.setup();
          java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
