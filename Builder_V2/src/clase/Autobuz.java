package clase;

public class Autobuz {
    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textRulat;

    public Autobuz(String numeSofer, int nrLinie, boolean pauzaSofer, boolean deschideUsile, int oraIncepereProgram, String textRulat) {
        this.numeSofer = numeSofer;
        this.nrLinie = nrLinie;
        this.pauzaSofer = pauzaSofer;
        this.deschideUsile = deschideUsile;
        this.oraIncepereProgram = oraIncepereProgram;
        this.textRulat = textRulat;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Autobuz{");
        sb.append("numeSofer='").append(numeSofer).append('\'');
        sb.append(", nrLinie=").append(nrLinie);
        sb.append(", pauzaSofer=").append(pauzaSofer);
        sb.append(", deschideUsile=").append(deschideUsile);
        sb.append(", oraIncepereProgram=").append(oraIncepereProgram);
        sb.append(", textRulat='").append(textRulat).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
