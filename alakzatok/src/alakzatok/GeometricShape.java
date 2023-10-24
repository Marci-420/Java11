/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alakzatok;

/**
 *
 * @author User1
 */
public class GeometricShape {

    private String name;
    private double area;

public GeometricShape(String name, double area){
        this.name = name;
        this.area = area;

    }

    public String getName(){
            return name;
            }
   
    public void setName(String name) {
        this.name = name;
    }
    
    public double getArea(){
                return area;
            }
   
    public void setArea(double area) {
        this.area = area;
    }

}
