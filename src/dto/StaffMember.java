/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author ANUJA
 */
public class StaffMember implements StaffComponent {
    private String name;
    private String role;
    private String mobile;
    private String address;
    private String username;
    private String password;

    public StaffMember(String name, String role, String mobile, String address, String username, String password) {
        this.name = name;
        this.role = role;
        this.mobile = mobile;
        this.address = address;
        this.username = username;
        this.password = password;
    }

    @Override
    public void showDetails() {
        System.out.println("Staff: " + name + " | Role: " + role + " | Mobile: " + mobile);
    }

    public String getName() { return name; }
    public String getRole() { return role; }
    public String getMobile() { return mobile; }
    public String getAddress() { return address; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
}