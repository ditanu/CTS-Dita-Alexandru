package flyweight_sportiv;

public class Spectator implements ISpectator {
    private int id;
    private int inaltime;
    private int latime;

    public Spectator(int id, int inaltime, int latime) {
        this.id = id;
        this.inaltime = inaltime;
        this.latime = latime;
    }


    @Override
    public void desenarePozitie(PozitieDesenare pozitieDesenare) {
        System.out.println(this.toString() + pozitieDesenare.toString());
    }

    @Override
    public String toString() {
        return "Spectator{" +
                "id=" + id +
                ", inaltime=" + inaltime +
                ", latime=" + latime +
                '}';
    }
}
