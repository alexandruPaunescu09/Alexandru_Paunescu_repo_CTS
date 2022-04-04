package clase;

public class AutobuzBuiler implements Builder{

    private Autobuz autobuz;
    private String numeSofer;
    private int nrLinie;
    private boolean pauzaSofer;
    private boolean deschideUsile;
    private int oraIncepereProgram;
    private String textRulat;


    public AutobuzBuiler() {
        this.numeSofer = "sofer";
        this.nrLinie = 0;
        this.pauzaSofer = true;
        this.deschideUsile = true;
        this.oraIncepereProgram = 0;
        this.textRulat = "STB";

    }

    @Override
    public Autobuz build() {
        return new Autobuz(this.numeSofer,this.nrLinie,this.pauzaSofer,this.deschideUsile,this.oraIncepereProgram,this.textRulat);;
    }

    public AutobuzBuiler setNumeSofer(String numeSofer) {
        this.numeSofer = numeSofer;
        return this;
    }

    public AutobuzBuiler setNrLinie(int nrLinie) {
        this.nrLinie = nrLinie;
        return this;
    }

    public AutobuzBuiler setPauzaSofer(boolean pauzaSofer) {
        this.pauzaSofer = pauzaSofer;
        return this;
    }

    public AutobuzBuiler setDeschideUsile(boolean deschideUsile) {
        this.deschideUsile = deschideUsile;
        return this;
    }

    public AutobuzBuiler setOraIncepereProgram(int oraIncepereProgram) {
        this.oraIncepereProgram = oraIncepereProgram;
        return this;
    }

    public AutobuzBuiler setTextRulat(String textRulat) {
        this.autobuz.setTextRulat(textRulat);
        return this;
    }
}
