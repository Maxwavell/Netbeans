/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
//Habilitación de input via usuario
    import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner sc= new Scanner(System.in);
        double radio,area,longitud;

        System.out.println("Introduce el radio ");
            radio=sc.nextDouble();
              area= Math.PI*radio*radio;
              longitud= 2*Math.PI*radio;
        System.out.println("el área es : " + (area));
        System.out.println("la longitud es : " +(longitud));
   
    
    4
    
    
    
    
    
    
    }
    
}
