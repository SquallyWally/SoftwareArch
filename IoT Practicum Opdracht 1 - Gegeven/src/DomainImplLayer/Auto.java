package DomainImplLayer;

public class Auto implements AutoSnelheidImp {

    private Snelheid HuidigeSnelheid;
    private int GewensteSnelheid;


    public Auto() {
        HuidigeSnelheid = new Snelheid();
        GewensteSnelheid = 0;
    }

    public Snelheid snelheid() {
        return HuidigeSnelheid;
    }

    public void setGewensteSnelheid(AutoSnelheidImp AutoSnelheidImp) {
        GewensteSnelheid = AutoSnelheidImp.vraagWaarde();
        naarSnelheid();
        System.out.println(GewensteSnelheid);
    }

    public void naarSnelheid() {
        while (HuidigeSnelheid.waarde() < GewensteSnelheid) {
            HuidigeSnelheid.verhoog();
        }
        while (HuidigeSnelheid.waarde() > GewensteSnelheid) {
            HuidigeSnelheid.verlaag();
        }
    }


    @Override
    public int vraagWaarde() {
        return HuidigeSnelheid.waarde();
    }
}
