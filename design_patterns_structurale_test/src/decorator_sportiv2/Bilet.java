package decorator_sportiv2;

public class Bilet implements IBilet{
    private String numeEchipa1;
    public String numeEchipa2;
    public String numeCumparator;

    public Bilet(String numeEchipa1, String numeEchipa2, String numeCumparator) {
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
        this.numeCumparator = numeCumparator;
    }

    @Override
    public String getNumeEchipa1() {
        return this.numeEchipa1;
    }

    @Override
    public void printBilet() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Bilet{" +
                "numeEchipa1='" + numeEchipa1 + '\'' +
                ", numeEchipa2='" + numeEchipa2 + '\'' +
                ", numeCumparator='" + numeCumparator + '\'' +
                '}';
    }
}
