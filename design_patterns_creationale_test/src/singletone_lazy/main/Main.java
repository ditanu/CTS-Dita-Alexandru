package singletone_lazy.main;

import singletone_lazy.models.Soare;

public class Main {
    public static void main(String[] args) {
        Soare soare1 = Soare.getInstance("roz", 10000);
        Soare soare2 = Soare.getInstance("galben", 10);
        System.out.println(soare2.toString());
    }
}
