/*
 * Aplicación que mide tu indice de masa corporal y determina que tipo de peso tienes
 * Islas Santos Esteban TIC 42
 * Universidad Tecnológica de Tulancingo.
 */
package main;

import model.ModelIMC;
import view.ViewIMC;
import controller.ControllerIMC;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ModelIMC modelIMC = new ModelIMC();
        ViewIMC viewIMC = new ViewIMC();
        ControllerIMC controllerIMC = new ControllerIMC(modelIMC, viewIMC);
        
    }

}
