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
public class DigitaleMeter extends javax.swing.JLabel implements Observer {

    private Snelheid S;

    public DigitaleMeter(Snelheid s) {
        S = s;
        s.insertObserver(this);
    }

    public void update() {
        setText(String.valueOf(S.waarde()));
        System.out.println("Digitaal " + S.toString());
    }
}
