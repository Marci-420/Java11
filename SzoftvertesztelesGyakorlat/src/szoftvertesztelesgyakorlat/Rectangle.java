/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package szoftvertesztelesgyakorlat;

/**
 *
 * @author User1
 */
public class Rectangle {

    //privát adat
    private double a, b;

    public Rectangle(double a, double b){
    
        this.a = a;
        this.b = b;
    }

    public Rectangle(){
        this.a = 0;
        this.b = 0;

}

    public boolean isSquare(){
        return (a==b);
}


    public String toString(){
        return "A: " + this.a + " B: " + this.b;
}

    public double getTerulet(){
        return this.a * this.b;
}

    public double getKerulet(){
        return 2* (this.a + this.b);
}


    //setter
    public void setA(int a){
        this.a = a;
}

    public void setB(int b){
            this.b = b;
    }


    //getter
    public double getA(){
        return this.a;
}

    public double getB(){
            return this.b;
    }



}
