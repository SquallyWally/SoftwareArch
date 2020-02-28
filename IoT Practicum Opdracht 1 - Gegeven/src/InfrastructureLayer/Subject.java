/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfrastructureLayer;

/**
 *
 * @author mlk_s
 */
public interface Subject {

    static ChangeManager manager = new ChangeManager();

    default public void insertObserver(Observer x) {
        manager.register(this, x);
    }

    default public void removeObserver(Observer x) {
        manager.unRegister(x);
    }

    default public void notifyObeservers() {
        manager.notifyObservers(this);
    }

    public static Subject get(Observer x) {
        return ChangeManager.get(x);
    }

}
