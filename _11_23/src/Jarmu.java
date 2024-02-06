public class Jarmu implements iAutomoso {

   private String tipus, rendszam;
   private int szolgaltatas;

   public Jarmu(String tipus, String rendszam, int szolgaltatas) {
      this.setTipus(tipus);
      this.setRendszam(rendszam);
      this.setSzolgaltatas(szolgaltatas);
   }

   public String getTipus() {
      return tipus;
   }

   private void setTipus(String tipus) {
      this.tipus = tipus;
   }

   public String getRendszam() {
      return rendszam;
   }

   private void setRendszam(String rendszam) {
      this.rendszam = rendszam;
   }

   public int getSzolgaltatas() {
      return szolgaltatas;
   }

   public String getSzolgaltatasSzovege() {
      return SZOLGALTATASOK[this.getSzolgaltatas()];
   }


   public void setSzolgaltatas(int szolgaltatas) {
      this.szolgaltatas = szolgaltatas;
   }

   @Override
   public String toString() {
      return "Jarmu{" +
              "tipus='" + this.getTipus() + '\'' +
              ", rendszam='" + this.getRendszam() + '\'' +
              ", szolgaltatas=" + this.getSzolgaltatasSzovege() +
              '}';
   }
}
