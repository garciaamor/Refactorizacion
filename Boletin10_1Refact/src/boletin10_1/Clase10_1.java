package boletin10_1;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class Clase10_1 {
    
    int numadiv;
    int numintent;

    public void numPreguntado() {
        do {
            numadiv = Integer.parseInt(introducir("Introduce el numero a adivinar entre 1 y 50"));
        } while (numadiv < 1 || numadiv > 50);
    }

    public void numIntentos() {
        do {
            numintent = Integer.parseInt(introducir("Introduce el numero de intentos entre 4 y 8"));
        } while (numintent < 4 || numintent > 8);
    }
    public void imprimir(String cadenaAimprimir, int opcion) {
        
        switch (opcion){
            case 0: System.out.println(cadenaAimprimir);
                break;
            case 1: JOptionPane.showMessageDialog(null, cadenaAimprimir);
                break;
            case 2: JOptionPane.showConfirmDialog(null, cadenaAimprimir);
                break;
            
        }
    }
    public String introducir (String pregunta){
        String dato;
        dato=JOptionPane.showInputDialog(pregunta);
                return dato;
    }
    
    
    public void juego() {
        boolean perdiste = true;
        boolean novalido = false;

        for (int i = 0; i < numintent; i++) {
            perdiste = metodoNuevo(perdiste);
        }
        if (perdiste) {
            imprimir("Se te han acabado los intentos, has perdido",0);

        }
    }

    public boolean metodoNuevo(boolean perdiste) throws NumberFormatException, HeadlessException {
        boolean novalido;
        do {
            int respuesta = Integer.parseInt(introducir("Introduce el numero repuesta"));
            if (respuesta >= 1 && respuesta <= 50) {
                if (respuesta > numadiv) {
                    imprimir("El numero introducido es mayor que el numero a adivinar",1);
                } else if (respuesta < numadiv) {
                    imprimir("El numero introducido es menor que el numero a adivinar",2);
                    
                } else {
                    imprimir("Has acertado",0);
                    perdiste = false;
                    break;
                }
                novalido = false;
            } else {
                novalido = true;
            }
        } while (novalido);
        return perdiste;
    }
}
