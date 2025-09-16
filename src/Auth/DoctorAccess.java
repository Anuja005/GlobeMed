/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Auth;

/**
 *
 * @author ANUJA
 */
public class DoctorAccess extends BasicAccess {
    public DoctorAccess(AccessControl access) { super(((BasicAccess)access).username); }

    @Override
    public void accessDashboard() {
        super.accessDashboard();
        System.out.println("Doctor");
    }
}
