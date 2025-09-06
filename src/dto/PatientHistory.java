/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Stack;

/**
 *
 * @author ANUJA
 */

public class PatientHistory {
    private final Stack<PatientMemento> history = new Stack<>();

    public void save(Patient patient) {
        history.push(new PatientMemento(patient));
    }

    public Patient undo() {
        if (!history.isEmpty()) {
            return history.pop().getSavedState();
        }
        return null;
    }
}
