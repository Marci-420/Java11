
public class Verem {
    private int v[], n, k;

    public Verem(int n) {
        v = new int[n];
        this.setN(n);
        this.setK(0);
    }



    public int getN() {
        return n;
    }

    private void setN(int n) {
        this.n = n;
    }

    public int getK() {
        return k;
    }

    private void setK(int k) {
        this.k = k;
    }



    public boolean add(int szam) {
        if (k < n) {
            v[k++] = szam;
            return true;
        }
        return false;
    }

    public boolean remove() {
        if (k > 0) {
            k--;
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        return k == 0;
    }

    public String toString() {
        String szov = "A Verem maximális mérete: " + this.getN() +
                ", aktuális mérete: " + this.getK();
            if (!isEmpty()) {
                szov+=", elemei: ";
                for (int i = k-1; i>= 0; i--) {
                    szov+= v[i] + " ";
                }
            }
            return szov;
}
}
