public class Macska {
    private double suly;
    private boolean ehes;

    public Macska(double suly, boolean ehese) throws IllegalArgumentException{
        this.setSuly(suly);
        this.setEhes(ehese);
    }

    public Macska(double suly) throws IllegalArgumentException{
        this(suly,true);
    }

    public double getSuly() {
        return suly;
    }

    public void setSuly(double suly) throws IllegalArgumentException {
        if(suly <= 0){
            throw new IllegalArgumentException("Macska súlya csak pozitív szám lehet");
        }
        this.suly = suly;
    }

    public boolean isEhes() {
        return ehes;
    }

    public void setEhes(boolean ehese) {
        this.ehes = ehese;
    }


    public void eszik(double etel) throws IllegalArgumentException, CatException{
        if(etel <= 0){
            throw new IllegalArgumentException("Étel súlya nagyobb kell legyen 0-nál");
        }
        if(!isEhes()){
            throw new CatException("A macska nem éhes, ne etesse");
        }
        this.setSuly(this.getSuly() + etel);
        this.setEhes(false);
    }

    public void futkos() throws CatException{
        double ujsuly = this.getSuly() - 0.1;
        if(ujsuly <= 0.1){
            throw new CatException("A macska már nem képes futni");
        }
        this.setSuly(ujsuly);
        if(!this.isEhes()){
            this.setEhes(true);
        }
    }

    @Override
    public String toString() {
        return "Macska: " +
                " sÚly=" + getSuly() +
                ", Éhes-e=" + (isEhes() ? "igen" : "nem");
    }

}