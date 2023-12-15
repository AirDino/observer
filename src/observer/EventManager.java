/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer;

/**
 *
 * @author Usuario
 */

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void suscripcion(String tipo_evento, EventListener listener) {
        List<EventListener> users = listeners.get(tipo_evento);
        users.add(listener);
    }

    public void cancelar_suscrib(String tipo_evento, EventListener listener) {
        List<EventListener> users = listeners.get(tipo_evento);
        users.remove(listener);
    }

    public void notificacion(String tipo_evento, File archivo) {
        List<EventListener> users = listeners.get(tipo_evento);
        for (EventListener listener : users) {
            listener.actualizacion(tipo_evento, archivo);
        }
    }
}

