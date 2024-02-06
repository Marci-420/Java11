package org.example;

public class Szamitogep {

    private double MB, alapMB;
    private boolean isOn;

    public Szamitogep(double MB, boolean isOn) throws IllegalArgumentException {
        this.setMB(MB);
        this.alapMB = MB;
        this.setOn(isOn);
    }

    public Szamitogep() {
        this(8192, false);
    }

    public double getMB() {
        return MB;
    }

    private void setMB(double MB) {
        if(MB <= 0){
            throw new IllegalArgumentException("A memória csak 0-nál nagyobb lehet");
        }
        this.MB = MB;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void kapcsol(){
        this.isOn = !this.isOn;
    }

    public void programMasol(double meret) throws IllegalArgumentException, ComputerMemoryException{
        if(meret <= 0){
            throw new IllegalArgumentException("A fájlnak/programnak nagyobbnak kell lennie  0-nál!");
        }
        if(isOn == true && meret <= MB){
            MB-= meret;
        }
        else if( !isOn()){
            throw new ComputerMemoryException("Elsőnek be kell kapcsolni a gépet!");
        }
        else{
            throw new ComputerMemoryException(" Nem lehet másolni a programot, mert nincs elég memória!");
        }
    }

    public String toString(){
        return "[" + (int)this.alapMB + " MB, " + (int)this.getMB() + " MB, " + this.isOn() + "]";

    }
}
