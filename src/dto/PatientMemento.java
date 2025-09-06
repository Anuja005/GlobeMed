/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author ANUJA
 */
public class PatientMemento {
    private final Patient patient;

    public PatientMemento(Patient patient) {
        this.patient = new Patient(patient.getId(), patient.getName(), patient.getMobile(), patient.getAddress());
    }

    public Patient getSavedState() {
        return patient;
    }
}
