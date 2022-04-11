package clase;

public class Autobuz implements AutobuzLinie{

    private String model;
    private Integer anFabricare;
    private Integer nrLocuri;

    public Autobuz(String model, Integer anFabricare, Integer nrLocuri) {
        this.model = model;
        this.anFabricare = anFabricare;
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void descriereAutobuz(Linie linie) {
        System.out.println("Linie: " + linie.toString() + "Autobuz: "+ this.toString());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("model='").append(model).append('\'');
        sb.append(", anFabricare=").append(anFabricare);
        sb.append(", nrLocuri=").append(nrLocuri);
        sb.append('}');
        return sb.toString();
    }
}
