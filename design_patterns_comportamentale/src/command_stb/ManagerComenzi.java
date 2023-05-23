package command_stb;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ICommand> comenzi = new ArrayList<>();

    public void adaugaComanda(ICommand comanda){
        comenzi.add(comanda);
    }

    public void executaComanda(){
        if (comenzi.size() != 0) {
            comenzi.get(0).execute();
            comenzi.remove(0);
        }

    }
}
