/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package carbonfootprintinterface;
import java.util.ArrayList;

/**
 *
 * @author sid
 */
public class CarbonFootprintInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CarbonFootprint> list = new ArrayList<>();
        Bicycle b = new Bicycle("Hero", 200.4f);
        Car c = new Car("Honda", 20000.9f);
        Building bdg = new Building("IT", 1000, 4004.3f);
        list.add(b);
        list.add(c);
        list.add(bdg);
        
        for(CarbonFootprint item: list)
        {
            System.out.println(item);
            System.out.println("Carbon Footprint: " + item.getCarbonFootprint() + " units");
        }
        // TODO code application logic here
    }
    
}
