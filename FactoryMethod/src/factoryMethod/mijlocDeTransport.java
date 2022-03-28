package factoryMethod;

public abstract class mijlocDeTransport {
    protected int nrInmatriculare;

    public mijlocDeTransport(int nrInmatriculare) {
        this.nrInmatriculare = nrInmatriculare;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("factoryMethod.mijlocDeTransport{");
        sb.append("nrInmatriculare=").append(nrInmatriculare);
        sb.append('}');
        return sb.toString();
    }
}
