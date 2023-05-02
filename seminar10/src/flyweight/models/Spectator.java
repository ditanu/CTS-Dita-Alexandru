package flyweight.models;

public class Spectator implements ISpectator{

    private float inaltime;
    private float latime;
    private int id;

    public Spectator(float inaltime, float latime, int id) {
        this.inaltime = inaltime;
        this.latime = latime;
        this.id = id;
    }

    @Override
    public void deseneazaSpectator(PozitieDesenare pozitieDesenare) {
        System.out.println(this.toString() + pozitieDesenare.toString());
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "inaltime=" + inaltime +
                ", latime=" + latime +
                ", id=" + id +
                '}';
    }
}
