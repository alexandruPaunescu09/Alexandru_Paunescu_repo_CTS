package factoryMethod;

public class factoryAutobuz implements Factory{
    @Override
    public mijlocDeTransport getMijlocTransport(int nrInmatriculare) {
        return new Autobuz(nrInmatriculare);
    }
}
