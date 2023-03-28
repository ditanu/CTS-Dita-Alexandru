package prototype.main;

import prototype.model.Prototype;
import prototype.model.Reteta;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Float> solutii = new HashMap<String, Float>();
        solutii.put("solutia1", 40f);
        solutii.put("solutia2", 60f);
        Reteta reteta1 = new Reteta("reteta1", 100f, solutii);
        System.out.println(reteta1);

        Prototype retetaLaborator = reteta1.clonare();
        System.out.println(retetaLaborator);
    }
}
