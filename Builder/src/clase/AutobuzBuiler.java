package clase;

public class AutobuzBuiler implements Builder{

    private Autobuz autobuz;

    public AutobuzBuiler(){
        this.autobuz = new Autobuz("Sofer", 2,true,true,7,"STATIA FINALA");
    }

    @Override
    public Autobuz build() {
        return autobuz;
    }

    public AutobuzBuiler setNumeSofer(String numeSofer) {
        this.autobuz.setNumeSofer(numeSofer);
        return this;
    }

    public AutobuzBuiler setNrLinie(int nrLinie) {
        this.autobuz.setNrLinie(nrLinie);
        return this;
    }

    public AutobuzBuiler setPauzaSofer(boolean pauzaSofer) {
        this.autobuz.setPauzaSofer(pauzaSofer);
        return this;
    }

    public AutobuzBuiler setDeschideUsile(boolean deschideUsile) {
        this.autobuz.setDeschideUsile(deschideUsile);
        return this;
    }

    public AutobuzBuiler setOraIncepereProgram(int oraIncepereProgram) {
        this.autobuz.setOraIncepereProgram(oraIncepereProgram);
        return this;
    }

    public AutobuzBuiler setTextRulat(String textRulat) {
        this.autobuz.setTextRulat(textRulat);
        return this;
    }
}
