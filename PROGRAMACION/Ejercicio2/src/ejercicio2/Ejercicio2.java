/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
//Habilitación de input via usuario
    import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
    Scanner sc= new Scanner(System.in);
    double redondeado;
    
    System.out.println("Introduce el numero ");
            redondeado=sc.nextDouble();
        
        System.out.println("el numero redondeado es" + (int)(redondeado + 0.5));
 }
}
