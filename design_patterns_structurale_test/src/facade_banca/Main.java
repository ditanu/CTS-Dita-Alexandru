package facade_banca;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator("Gigel");
        OperatorSimplificat operatorSimplificat = new OperatorSimplificat(operator);

        operatorSimplificat.verificareSimplificata(20, true, true);
    }
}
