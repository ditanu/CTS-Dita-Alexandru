package flyweight_spital;

import java.util.HashMap;
import java.util.Map;

public class FabricaPacienti {
    private Map<Integer, IPacient> pacientiHashMap;

    public FabricaPacienti() {
        this.pacientiHashMap = new HashMap<>();
    }

    public IPacient getPacient(int id, String nume, int varsta){
        if (pacientiHashMap.get(id) != null) {
            return pacientiHashMap.get(id);
        } else {
            IPacient pacient = new Pacient(id, nume, varsta);
            pacientiHashMap.put(id, pacient);
            return pacient;
        }
    }
}
