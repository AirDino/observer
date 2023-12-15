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

public class LogOpenListener implements EventListener {
    private File registro;

    public LogOpenListener(String nombre_archivo) {
        this.registro = new File(nombre_archivo);
    }

    @Override
    public void actualizacion(String tipo_evento, File archivo) {
        System.out.println("Guardar en el registro " + registro + ": Alguien ha realizado la operación " + tipo_evento + " con el siguiente archivo: " + archivo.getName());
    }
}