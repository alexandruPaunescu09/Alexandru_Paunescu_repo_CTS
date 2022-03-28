package factoryMethod;

public class factoryTroleibuz implements  Factory{
    @Override
    public mijlocDeTransport getMijlocTransport(int nrInmatriculare) {
        return new Troleibuz(nrInmatriculare);
    }
}
