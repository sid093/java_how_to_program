/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package worldpopulationgrowth;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.lang.Math;
import javax.swing.JOptionPane;

/**
 *
 * @author sid
 */
public class worldPopulation extends JPanel {
    long currentPopulation;
    float currentRate;
    boolean animationStop;
    float xCoordinate;
    long projectedPopulation;
    int yearsToRun;
    int windowHeight;
    int windowWidth;
    int xInc;
    double populationScale;
    
    @Override
    public void paintComponent(Graphics g)
    {
        //while(animationStop);
        super.paintComponent(g);
        int index = 0;
        for(index = 0; index<= yearsToRun; xCoordinate += xInc, index++)
        {
            g.drawLine((int)xCoordinate, windowHeight, (int)xCoordinate, (int)(windowHeight * (1 - (projectedPopulation/populationScale))));
            //System.out.println((int)xCoordinate + " " + windowHeight + " " + (int)xCoordinate + " " + (int)(windowHeight * (projectedPopulation/populationScale)));
            //coordinates for graph
            System.out.println("Projected population after " + index + " years: " + projectedPopulation);
            projectedPopulation = (long)((1 + currentRate) * projectedPopulation); 
        }
    }
    
    public worldPopulation(long population, float rate, int height, int width, int years)
    {
        currentPopulation = population;
        projectedPopulation = population;
        currentRate = rate;
        animationStop = true;
        windowHeight = height;
        windowWidth = width;
        xCoordinate = 0;
        xInc = 0;
        yearsToRun = 0;
        runSimulation(years);
    }
    
    public void runSimulation(int years)
    {
        animationStop = false;
        yearsToRun = years;
        xInc = windowWidth/years;
        populationScale = (currentPopulation * Math.pow(1 + currentRate, years));
        System.out.println("Projected population after " + years + " years: " + (currentPopulation * Math.pow(1 + currentRate, years)));
        JOptionPane.showMessageDialog(null, "Projected population after " + years + " years: " + String.format("%.0f", populationScale));
        xCoordinate = 0;
    }
    
}
