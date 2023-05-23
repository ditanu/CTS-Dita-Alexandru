package flyweight_sportiv;

import java.util.HashMap;
import java.util.Map;

public class FabricaSpectator {
    private Map<Integer, ISpectator> spectatori;

    public FabricaSpectator() {
        this.spectatori = new HashMap<>();
    }

    public ISpectator getSpectator(int id, int inaltime, int latime) {
        if (spectatori.get(id) != null) {
            return spectatori.get(id);
        } else {
            ISpectator spectator = new Spectator(id, inaltime, latime);
            spectatori.put(id, spectator);
            return spectator;
        }
    }
}
