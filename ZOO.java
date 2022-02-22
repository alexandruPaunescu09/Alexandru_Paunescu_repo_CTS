package sources.animal;

public class ZOO {
	private String nume;
	private IngrijitorZOO ingrijitorZOO;
	private List<Animal> animale;
	public ZOO(String nume, IngrijitorZOO ingrijitorZOO, List<Animal> animale) {
		super();
		this.nume = nume;
		this.ingrijitorZOO = ingrijitorZOO;
		this.animale = new animale;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public IngrijitorZOO getIngrijitorZOO() {
		return ingrijitorZOO;
	}
	public void setIngrijitorZOO(IngrijitorZOO ingrijitorZOO) {
		this.ingrijitorZOO = ingrijitorZOO;
	}
	public List<Animal> getAnimale() {
		return animale;
	}
	
	
	
	
}
