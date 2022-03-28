package factoryMethod;

public class factoryTramvai implements Factory{
    @Override
    public mijlocDeTransport getMijlocTransport(int nrInmatriculare) {
        return new Tramvai(nrInmatriculare);
    }
}
