/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worldpopulationgrowth;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author sid
 */
public class WorldPopulationGrowth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int height = 500;
        int width = 500;
        int years = 75;
        long population = 7000000000l;
        float rate = 0.034f;
        population = Long.parseLong(JOptionPane.showInputDialog("Enter current population"));
        rate = Float.parseFloat(JOptionPane.showInputDialog("Enter current rate of growth"));
        years = Integer.parseInt(JOptionPane.showInputDialog("Enter number of years to project"));
        worldPopulation panel = new worldPopulation(population, rate, height, width, years);
        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.add(panel);
        application.setSize(height, width);
        application.setVisible(true);
        //panel.runSimulation(75);
    }
    
}
