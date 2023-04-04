package singletone_registry.main;

import singletone_registry.models.DomeniuInternet;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        DomeniuInternet domeniuInternet1 = DomeniuInternet.getDomeniu("seminar4.ro");
        DomeniuInternet domeniuInternet2 = DomeniuInternet.getDomeniu("seminar5.ro");
        domeniuInternet2.setAnInregistrare(2028);
        System.out.println(domeniuInternet1.toString());
        System.out.println(domeniuInternet2.toString());

        // putem sa iteram cu map cu ajutorul metodei ENTRYSET
//        for(Map.Entry<String, DomeniuInternet> domeniuInternet : DomeniuInternet.domeniiInternet.entrySet() ) {
//            System.out.println(domeniuInternet.getKey() + "/" + domeniuInternet.getValue());
//        }
    }
}
