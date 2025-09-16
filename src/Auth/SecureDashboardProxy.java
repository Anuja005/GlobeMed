/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auth;

import dto.UserType;
import gui.AdminDashboardFrame;
import gui.BillingOfficerDashboardFrame;
import gui.DoctorDashboardFrame;
import gui.NurseDashboardFrame;
import gui.PatientDashboardFrame;
import gui.PharmacistDashboardFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ANUJA
 */
public class SecureDashboardProxy {
    private final UserType role;

    public SecureDashboardProxy(UserType role) {
        this.role = role;
    }

    public void openDashboard(String username) {
        switch (role) {
            case Admin -> new AdminDashboardFrame(username, role).setVisible(true);
            case Doctor -> new DoctorDashboardFrame(username, role).setVisible(true);
            case Nurse -> new NurseDashboardFrame(username, role).setVisible(true);
            case Pharmacist -> new PharmacistDashboardFrame(username, role).setVisible(true);
            case BillingOfficer -> new BillingOfficerDashboardFrame(username, role).setVisible(true);
            case Patient -> new PatientDashboardFrame(username, role).setVisible(true);
            default -> JOptionPane.showMessageDialog(null, "Unknown User Type!");
        }
    }
}
