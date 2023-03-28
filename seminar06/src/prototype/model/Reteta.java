package prototype.model;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements Prototype {

    private String nume;
    private Float gramajMedicament;
    private Map<String, Float> solutii ;

    public Reteta(String nume, Float gramajMedicament, Map<String, Float> solutii) {
        this.nume = nume;
        this.gramajMedicament = gramajMedicament;
        float suma = 0;
        for (Float val : solutii.values()) {
            suma+=val;
        }

        if (this.gramajMedicament == suma) {
            this.solutii = solutii;
        }
        else {
            throw new IllegalArgumentException("suma nu este egala cu gramajul medicamentului!");
        }
    }

    private Reteta() {

    }

    @Override
    public Reteta clonare() {
        Reteta reteta = new Reteta();
        reteta.nume = this.nume;
        reteta.gramajMedicament = this.gramajMedicament;
        reteta.solutii = new HashMap<String, Float>();
        for(String val : this.solutii.keySet()) {
            reteta.solutii.put(val, this.solutii.get(val));
        }
        return reteta;
    }

//    @Override
//    public String toString() {
//        return "Reteta{" +
//                "nume='" + nume + '\'' +
//                ", gramajMedicament=" + gramajMedicament +
//                ", solutii=" + solutii +
//                '}';
//    }
}
