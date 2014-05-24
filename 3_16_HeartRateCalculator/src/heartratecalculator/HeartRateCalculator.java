/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package heartratecalculator;
import javax.swing.JOptionPane;

/**
 *
 * @author sid
 */
public class HeartRateCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here `
    String fName = JOptionPane.showInputDialog("What is your first name?");
    String lName = JOptionPane.showInputDialog("What is your last name?");
    String dob = JOptionPane.showInputDialog("Enter date of birth(dd/mm/yyyy)");   
    heartRates person = new heartRates(fName, lName, new date(dob));
    person.displayDetails();
    }
    
}
