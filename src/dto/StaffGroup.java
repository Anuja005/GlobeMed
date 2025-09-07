/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ANUJA
 */
public class StaffGroup implements StaffComponent {
    private String groupName;
    private List<StaffComponent> staffList = new ArrayList<>();

    public StaffGroup(String groupName) {
        this.groupName = groupName;
    }

    public void addStaff(StaffComponent staff) {
        staffList.add(staff);
    }

    public void removeStaff(StaffComponent staff) {
        staffList.remove(staff);
    }

    @Override
    public void showDetails() {
        System.out.println("Role Group: " + groupName);
        for (StaffComponent staff : staffList) {
            staff.showDetails();
        }
    }
}