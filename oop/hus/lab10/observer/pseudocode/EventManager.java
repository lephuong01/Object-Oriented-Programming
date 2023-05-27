package oop.hus.lab10.observer.pseudocode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager {
    private HashMap<String, List<EventListeners>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListeners listener) {
        List<EventListeners> user = listeners.get(eventType);
        user.add(listener);
    }

    public void unsubscribe(String eventType, EventListeners listener) {
        List<EventListeners> users = listeners.get(eventType);
        users.remove(listener);
    }

    public void notify(String evenType, String data) {
        List<EventListeners> user = listeners.get(evenType);
        for (EventListeners listener : user) {
            listener.update(data);
        }
    }

}
