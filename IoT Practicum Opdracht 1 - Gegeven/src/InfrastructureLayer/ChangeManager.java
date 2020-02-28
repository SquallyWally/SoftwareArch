/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InfrastructureLayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author mlk_s
 */
public class ChangeManager implements Subject{

    private static Map<Observer, Subject> map = new HashMap<>();

    public static Subject get(Observer x) {
        return map.get(x);
    }

    public void register(Subject S, Observer x) {
        map.put(x, S);

    }

    public void unRegister(Observer x) {
        map.remove(x);
    }

    public List<Observer> getObservers(Subject subject) {

        List<Observer> list = new ArrayList<>();
        Set<Entry<Observer, Subject>> hashSet = map.entrySet();

        for (Entry entry : hashSet) {
            if (entry.getValue() == subject) {
                list.add((Observer) entry.getKey());
            }
        }

        return list;
    }

    /**
     *
     * @param S
     */
    public void notifyObservers(Subject S) {
        Set<Entry<Observer, Subject>> hashSet = map.entrySet();
        for (Entry e : hashSet) {
            if (e.getValue() == S) {
                ((Observer) e.getKey()).update();
            }
        }
    }
}
