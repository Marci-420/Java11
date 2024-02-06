public class Main {
    public static void main(String[] args) {

        Szolgaltato sz = new Szolgaltato();
        try {
            SIM s1 = new SIM ("123456789", "1234", "4561");
            SIM s2 = new SIM ("223456789", "1235", "4562");
            SIM s3 = new SIM ("323456789", "1236", "4563");

            sz.add(s1);
            sz.add(s2);
            sz.add(s3);

        } catch (NumberFormatException nfe) {
            System.out.println("PIN/PUK hiba: " +nfe.getMessage());
        } catch (Exception e) {
            System.out.println("Telefonszám hiba: "+e.getMessage());
        }

        System.out.println(sz);
        if(sz.isPinCode("123456789", "1234")){
            System.out.println("Nincs egyezés!");
        }
        if(sz.isPinCode("123456789", "5678")){
            System.out.println("Nincs egyezés!");
        }

    }
}