package clase;

public class SMS implements ModPlata{

    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata in valoare de " + pret + " lei, prin SMS");
    }
}
