package boletin10_1;

import javax.swing.JOptionPane;

public class Clase10_1 {
   
    int numadiv;
    int numintent;
   
    public void numpregunta(){
        do {
            numadiv=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a adivinar entre 1 y 50"));
        } while (numadiv<1||numadiv>50);
    }
    public void numposib(){
        do {
            numintent=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de intentos entre 4 y 8"));
        } while (numintent<4||numintent>8);
    }                        
    public void juego(){
        boolean perdiste = true;
        boolean novalido = false;
        
        for (int i=0;i<numintent;i++){
            do{
                int respuesta=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero repuesta"));
                if (respuesta>=1&&respuesta<=50){
                    if (respuesta>numadiv){
                        JOptionPane.showMessageDialog(null, "El numero introducido es mayor que el numero a adivinar");
                    }
                    else if (respuesta<numadiv){
                        JOptionPane.showMessageDialog(null, "El numero introducido es menor que el numero a adivinar");
                         
                    } else {
                        JOptionPane.showMessageDialog(null, "Has acertado");
                   perdiste=false;
                    break;
                    }
               novalido=false;
            } else {
                novalido=true;
                    }
        }while (novalido);
    }
    if (perdiste){
    JOptionPane.showMessageDialog(null, "Se te han acabado los intentos, has perdido");
                        
}       
    }
}
    

            
        
            
        
            
            
        


