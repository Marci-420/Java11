public class Main {
    public static void main(String[] args) {
    Verem v = new Verem(7);

    for(int i=1; i<=10; i ++){
        if(!v.add(i)){
            System.out.println("A verem megtelt!");
        }
    }
        System.out.println(v);

    for(int i=1; i<=8; i++){
        if(!v.remove()){
            System.out.println("A verem üres!");
        }
    }
        System.out.println(v);
    }
}