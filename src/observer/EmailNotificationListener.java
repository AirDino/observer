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

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void actualizacion(String tipo_evento, File archivo) {
        System.out.println("Email para " + email + ": Alguien ha realizado la operación  " + tipo_evento + "  con el siguiente archivo: " + archivo.getName());
    }
   
}