package facade_banca;

public class Operator {
    private String nume;

    public Operator(String nume) {
        this.nume = nume;
    }

    public void verificareVarsta(int varsta){
        if (varsta < 18) {
            System.out.println("Varsta este prea mica!");
        } else {
            System.out.println("Esti major este okey");
        }
    }

    public void verificaUrmarit(boolean esteUrmarit) {
        if (esteUrmarit) {
            System.out.println("Nu ti putem crea cont deoarece esti urmarit de politie");
        } else {
            System.out.println("Esti okey nu esti urmarit de politie!");
        }
    }

    public void verificaCreante(boolean areCreante) {
        if (areCreante) {
            System.out.println("Ai creante la alte banci!");
        }else {
            System.out.println("Nu ai creante la alte banci!");
        }
    }
}
