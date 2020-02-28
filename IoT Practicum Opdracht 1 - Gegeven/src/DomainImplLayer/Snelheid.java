package DomainImplLayer;

import DomainLayer.SnelheidInterface;
import InfrastructureLayer.Subject;

public class Snelheid implements SnelheidInterface, Subject {

    private int Waarde;

    public Snelheid() {
        Waarde = 0;
    }

    public int waarde() {
        return Waarde;
    }

    public void verhoog() {

        System.out.println("hoger");
        Waarde++;
        notifyObeservers(); //Zodat die die shit niet override, dan gaat die niet via Presentation
    } // Simulatie


    public void verlaag() {
        System.out.println("lager");
        Waarde--;
        notifyObeservers(); //Zodat die die shit niet override
    } // Simulatie
}
