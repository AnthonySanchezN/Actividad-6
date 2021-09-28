
package activdad.pkg6;

import static activdad.pkg6.Estudiante.ingresarName;

import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;



public class Activdad6 {

    
    public static void main(String[] args) throws IOException {
       Calificacion cal = new Calificacion();
       double[] calificaciones = {10, 85, 90, 75, 80};
       cal.setCalificaciones(calificaciones);
       
       ingresarName(); 
       cal.imprimirCalificaciones();
       cal.imprimirPromedio();
      
       
       
       
    }
    
}
