package facade_banca;

public class OperatorSimplificat {
    private Operator operator;

    public OperatorSimplificat(Operator operator) {
        this.operator = operator;
    }

    public void verificareSimplificata(int varsta, boolean esteUrmarit, boolean areCreante) {
        operator.verificareVarsta(varsta);
        operator.verificaUrmarit(esteUrmarit);
        operator.verificaCreante(areCreante);
    }
}
