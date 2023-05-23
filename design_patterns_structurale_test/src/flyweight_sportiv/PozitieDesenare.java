package flyweight_sportiv;

public class PozitieDesenare {
    private String culoareTricou;

    public PozitieDesenare(String culoareTricou) {
        this.culoareTricou = culoareTricou;
    }

    @Override
    public String toString() {
        return "PozitieDesenare{" +
                "culoareTricou='" + culoareTricou + '\'' +
                '}';
    }
}
