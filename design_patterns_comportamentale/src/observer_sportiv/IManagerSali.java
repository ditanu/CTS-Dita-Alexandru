package observer_sportiv;

public interface IManagerSali {
    public void notifica(String mesaj);
    public void abonareClient(IClient client);
    public void dezabonareClient(IClient client);
}
