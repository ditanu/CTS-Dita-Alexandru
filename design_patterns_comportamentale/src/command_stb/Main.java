package command_stb;

public class Main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi = new ManagerComenzi();

        ComandaPlecare comandaPlecare1 = new ComandaPlecare(10, new Autobuz(2));
        ComandaPlecare comandaPlecare2 = new ComandaPlecare(2, new Autobuz(4));
        ComandaPlecare comandaPlecare3 = new ComandaPlecare(10, new Autobuz(5));
        ComandaPlecare comandaPlecare4 = new ComandaPlecare(4, new Autobuz(9));

        managerComenzi.adaugaComanda(comandaPlecare1);
        managerComenzi.adaugaComanda(comandaPlecare2);
        managerComenzi.adaugaComanda(comandaPlecare3);
        managerComenzi.adaugaComanda(comandaPlecare4);

        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();

    }
}
