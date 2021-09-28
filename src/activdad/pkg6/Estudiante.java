package activdad.pkg6;
import java.util.Scanner;

public class Estudiante {
    public String name;
    
    public String getName(){
        return this.name;
    }
    
   public void setName(String name){
        this.name = name;
   }
   
   public static void ingresarName(){
       Scanner entrada = new Scanner(System.in);
       String name;
       String lastName;
       
       System.out.println("Ingrese el nombre del alumno: \n");
       name = entrada.next();
       
       System.out.println("Ingresa el apellido del alumno: \n");
       lastName = entrada.next();
       
       System.out.println(name + " " + lastName);
   }
}
