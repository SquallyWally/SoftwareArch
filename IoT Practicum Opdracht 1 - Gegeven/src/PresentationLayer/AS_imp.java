package PresentationLayer;

import DomainImplLayer.AutoSnelheidImp;

import javax.swing.*;


public class AS_imp extends javax.swing.JOptionPane implements AutoSnelheidImp {
    // @Override
    public int vraagWaarde() {


        String value = JOptionPane.showInputDialog("Snelheid mate: ");

        return Integer.parseInt(value);

    }
}
