package factory;

public class Factory {
    public mijlocDeTransport getMijlocDeTransport(tipTransport t, int nrInmatriculare){
        switch (t){
            case AUTOBUZ:
                return new Autobuz(nrInmatriculare);
            case TRAMVAI:
                return new Tramvai(nrInmatriculare);
            case TROLEIBUZ:
                return new Troleibuz(nrInmatriculare);
            default:
                    return null;
        }

    }
}
