/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observer;

/**
 *
 * @author Usuario
 */
import java.io.File;

public interface EventListener {
    void actualizacion(String tipo_evento, File archivo);
}