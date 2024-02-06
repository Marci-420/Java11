import java.sql.SQLOutput;

public class Main implements iAutomoso{
    public static void main(String[] args) {

        Automoso a = new Automoso("Bánki Pénz- és Autómosó Kft.");

        Mososor m1 = new Mososor();
        Mososor m2 = new Mososor();
        Mososor m3 = new Mososor();

        Jarmu j = new Jarmu(SZEMELYAUTO, "ABC-123", KULSO_MOSAS);
        Jarmu j2 = new Jarmu(TEHERAUTO, "ABC-122", BELSO_MOSAS);
        Jarmu j3 = new Jarmu(BUSZ   , "ABC-124", KULSO_BELSO);
        Jarmu j4 = new Jarmu(SZEMELYAUTO, "ABC-125", KULSO_MOSAS);

        m1.add(j);
        m2.add(j2);
        m3.add(j3);
        m1.add(j4);

        m3.remove(j3);

        a.add(m1);
        a.add(m2);
        a.add(m3);

        System.out.println(a);

    }
}