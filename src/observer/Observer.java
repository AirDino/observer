/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observer;

import observer.Editor;
 
/**
 *
 * @author Usuario
 */
public class Observer {
    
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.suscripcion("abrir", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.suscripcion("guardar", new EmailNotificationListener("drel@gmail.com"));

        try {
            editor.abrirarchivo("test.txt");
            editor.guardararchivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
