package FlyweightFactory;

import clase.Linie;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    Map<Integer, Linie> liniiMap;

    public FlyweightFactory(){
        liniiMap = new HashMap<>();
    }


    public Linie getLinie(Integer nrLinie){
        Linie aux =liniiMap.get(nrLinie);
        if(aux !=null){
            return aux;
        }else{
            //Statiile pot fi preluate din fisier sau baze de date
        aux = new Linie(nrLinie,"Prima Statie", "Ultima Statie");
        liniiMap.put(nrLinie,aux);
        return aux;
        }
    }

}
