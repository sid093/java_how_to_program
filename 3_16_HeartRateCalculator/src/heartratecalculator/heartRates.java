package heartratecalculator;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sid
 */
public class heartRates {
    private String firstName;
    private String lastName;
    private date dateOfBirth;
    private int maxHeartRate;
    
    public heartRates(String inputFirstName, String inputLastName, date inputDateOfBirth)
    {
        firstName = inputFirstName;
        lastName = inputLastName;
        dateOfBirth = new date(inputDateOfBirth); //is it needed? already new object being passed
        calculateMaxHeartRate();
    }
    
    public heartRates(String inputFirstName, String inputLastName, String inputDateOfBirth)
    {
        firstName = inputFirstName;
        lastName = inputLastName;
        dateOfBirth = new date(inputDateOfBirth);
        calculateMaxHeartRate();
    }
    
    public void displayDetails()
    {
        String details;
        details = "Person Details\nName: " + firstName + " " + 
                lastName + "\n" + dateOfBirth.returnString() + "\nAge: " + 
                dateOfBirth.currentAge() + "\nMaximum Heartrate: " + maxHeartRate + 
                "\nTarget Heartrate between " + (float)maxHeartRate*0.5 + " and " + (float)maxHeartRate*0.85;
        JOptionPane.showMessageDialog(null, details);
    }
    
    public void calculateMaxHeartRate()
    {
        maxHeartRate = 220 - dateOfBirth.currentAge();
    }
   
}

class date {
    private int month;
    private int day;
    private int year;
    
    public static date now()
    {
        Date current = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        //System.out.println("Today's date: " + dateFormat.format(current));
        return new date(dateFormat.format(current));
    }
    
    public date(int d, int m, int y)
    {
        month = m;
        day = d;
        year = y;
    }
    
    public date(String inputDate) //takes in the dd/mm/yyyy format
    {
        String[] parts = new String[3];
        parts = inputDate.split("/");
        day = Integer.parseInt(parts[0]);
        month = Integer.parseInt(parts[1]);
        year = Integer.parseInt(parts[2]);
    }
    
    public date(date cloneDate)
    {
        this.month = cloneDate.month;
        this.day = cloneDate.day;
        this.year = cloneDate.year;
    }
    
    public String returnString()
    {
        return "Date of birth: " + day + "/" + month + "/" + year;
    }
    
    public int currentAge()
    {
        int years;
        date current = now();
        years = current.year - this.year;
        if (current.month < this.month)
            years -= 1;
        return years;
    }
}
