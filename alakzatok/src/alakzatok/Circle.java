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
public class Circle extends GeometricShape{

    private double radius;

public Circle(String name, double area, double radius){
    super(name, area);
            this.radius = radius;
            

    }

    public double getRadius(){
            return radius;
            }
   
    public void setRadius(double radius) {
        this.radius = radius;
    }

public String toString(){
        return "Alakzat típusa: " + this.getName() + ", Területe: " + this.getArea() + ", sugara: " + this.getRadius();
}
    
   

}
