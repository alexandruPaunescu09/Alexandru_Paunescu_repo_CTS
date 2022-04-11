package clase;

import java.util.ArrayList;
import java.util.List;

public abstract class MijlocDeTransport {
    protected List<Icalator> calatori;

    public MijlocDeTransport() {
        this.calatori = new ArrayList<>();
    }

    public void adaugaCalator(Icalator calator){
        calatori.add(calator);
    };

    public void eliminaCalator(Icalator calator){
        calatori.remove(calator);
    }

    public abstract void anuntaCalator();


}
