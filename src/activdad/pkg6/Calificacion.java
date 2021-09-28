package activdad.pkg6;

import java.util.Scanner;

public class Calificacion {
    public double[] calificaciones;
    
    
        public double[] getCalificaciones(){
            return this.calificaciones;}
        
        public void setCalificaciones(double[] calificaciones){
            this.calificaciones = calificaciones;}
        
        
        public double getPromedio(){
            double suma = 0;
            for(int i=0; i<this.calificaciones.length;i++){
                suma += calificaciones[i];
            }
            return suma/this.calificaciones.length;
        }
        
        public char getFinal(double promedio){
            if(promedio > 50 && promedio <= 60) return 'E';
            if(promedio > 60 && promedio <= 70) return 'D';
            if(promedio > 70 && promedio <= 80) return 'C';
            if(promedio > 80 && promedio <= 90) return 'B';
            if(promedio > 90 && promedio <= 100) return 'A';
            return 'F';
        }
        
        
         public void imprimirCalificaciones(){
             for (int i = 0; i<this.calificaciones.length; i++){
                 System.out.println("Calificacion " + (i+1) + ": " + this.calificaciones[i]);
             }
             
         }  
         
         public void imprimirPromedio(){
             double promedio = getPromedio();
             System.out.println("Promedio: " + promedio);
             System.out.println("Calificacion final: " + this.getFinal(promedio));
         }
         
         
}