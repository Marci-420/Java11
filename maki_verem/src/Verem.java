import java.util.Arrays;

public class Verem {
    private int v[], k, n;


    public Verem(int n) {
        v = new int[n];
        this.setK(0);
        this.setN(n);

    }

    public int getK() {
        return k;
    }

    public int getN() {
        return n;
    }

    private void setK(int k) {
        this.k = k;
    }

    private void setN(int n) {
        this.n = n;
    }

    //listához hozzáadás
    public boolean add(int szam){
        if(k < n) {
            v[k] = szam;
            this.setK(this.getK() + 1);
            return true;
        }
        return false;
    }


    //listából kivétel
    public boolean remove(){
        if(k>0){
            k--;
        }
        return false;
    }

    //üres-e?

    public boolean isEmpty(){
        return k == 0;
    }

    //adott szám keresése
    public int search(int szam){
        for(int i = k-1; i>=0; i--){
            if(v[i] == szam){
                return i;
            }
        }
        return -1;
    }

    //adott elem bene van-e?
    public boolean isContains(int szam){
        return search(szam)!= -1 ? true : false;
    }

    public String toString() {
        String str = "A verem maximális mérete: " +
                this.getN() +
                ", aktuális mérete: " + this.getK();


        if (!isEmpty()) {
            str += ", verem elemei: ";
            for (int i = k - 1; i > 0; i--) {
                str += v[i] + " ";
            }
        }
        return str;
    }
}
