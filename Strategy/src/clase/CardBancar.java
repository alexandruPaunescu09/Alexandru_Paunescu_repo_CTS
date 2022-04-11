package clase;

public class CardBancar implements ModPlata{

    @Override
    public void plateste(float pret) {
        System.out.println("A fost realizata plata in valoare de " + pret + " lei, prin card bancar");
    }
}
