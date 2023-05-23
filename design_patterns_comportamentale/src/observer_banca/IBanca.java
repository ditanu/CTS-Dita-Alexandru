package observer_banca;

public interface IBanca {
    public void adaugaObserver(IClient client);
    public void stergeOvserver(IClient client);
    public void notifica(String mesaj);
}
