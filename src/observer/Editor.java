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

public class Editor {
    public EventManager events;
    private File archivo;

    public Editor() {
        this.events = new EventManager("abrir", "guardar");
    }

    public void abrirarchivo(String filePath) {
        this.archivo = new File(filePath);
        events.notificacion("abrir", archivo);
    }

    public void guardararchivo() throws Exception {
        if (this.archivo != null) {
            events.notificacion("guardar", archivo);
        } else {
            throw new Exception("Primero abra un archivo.");
        }
    }
}
