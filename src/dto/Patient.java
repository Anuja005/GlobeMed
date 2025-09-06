/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author ANUJA
 */
public class Patient {
    private int id;
    private String name;
    private String mobile;
    private String address;

    public Patient(int id, String name, String mobile, String address) {
        this.id = id;
        this.name = name;
        this.mobile = mobile;
        this.address = address;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getMobile() { return mobile; }
    public String getAddress() { return address; }
}
