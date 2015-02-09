/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Ankita
 */
public class AdvancedJavaCourse extends Course {

    private String prerequisite;

    public AdvancedJavaCourse(String courseName, String courseNumber, double credits) {
        super(courseName, courseNumber, credits);
    }

    public String getPrerequisite() {
        return prerequisite;
    }

    public void setPrerequisite(String prerequisite) {
        if (prerequisite == null || prerequisite.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisite cannot be null or empty string");
            System.exit(0);
        }
        this.prerequisite = prerequisite;
    }

}
