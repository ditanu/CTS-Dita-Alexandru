package vSubiectBanca_3.main;

import vSubiectBanca_3.models.BuilderCont;
import vSubiectBanca_3.models.Cont;

public class Main {
    public static void main(String[] args) {
       BuilderCont builderCont = new BuilderCont();
       Cont cont1 = builderCont.setContSalariu(true).build();
       Cont cont2 = builderCont.setCardAtasat(true).build();
       System.out.println(cont1.toString());
       System.out.println(cont2.toString());

       BuilderCont builderCont2 = new BuilderCont();
       Cont cont3 = builderCont2.setCardAtasat(true).build();
       System.out.println(cont3.toString());
    }
}
