/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import DomainImplLayer.Snelheid;
import InfrastructureLayer.Observer;

/**
 *
 * @author mlk_s
 */
public class AnalogeMeter extends javax.swing.JProgressBar implements Observer {

    public static final int MAXSNELHEID = 300; // Maximaal 300 km/h mogelijk
    private Snelheid S;

    public AnalogeMeter(Snelheid s) {
        S = s;

        s.insertObserver(this);
    }

    public void update() {
        setValue((int) ((100.0 / MAXSNELHEID) * (S.waarde())));

        System.out.println("Analoog " + S.toString());
    }
}
