public class Rectangle {
        private double a, b;

        public Rectangle(double a, double b) {
            this.setA(a);
            this.setB(b);
        }

        public Rectangle() {
            this(0,0);
        }

        public boolean isNegyzet(){
            return a==b;
        }

        public Rectangle getNagyobb(Rectangle r1, Rectangle r2){
            return(r1.getTerulet()> r2.getTerulet())? r1 : r2;

        }

        public double getTerulet() {
            return a * b;
        }

        public double getKerulet() {
            return 2 * (a + b);
        }

        public void setA(double a) {
            this.a = a;
        }

        public void setB(double b) {
            this.b = b;
        }

        public double getA(){
            return this.a;
        }

        public double getB(){
            return this.b;
        }

        public String toString() {
            return "A: " + this.getA() +
                    ", B: " + this.getB() +
                    ", K= " + this.getKerulet() +
                    ", T= " + this.getTerulet() +
                    ", Négyzet? " + ( this.isNegyzet()? "igen" : "nem");
        }
    }

