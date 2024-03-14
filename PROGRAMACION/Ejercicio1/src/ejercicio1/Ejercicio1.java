/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
    //Habilitación de input via usuariov
    import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      /*escribir una aplicacion que pida el año actual y el de nacimiento del usuario debe calcular su edad suponiendo que en el año en curso el usuario ya ha cumplido años
      fecha de nacimiento:
      año actual:
      */
    
   //variables
    Scanner sc= new Scanner(System.in);
    int year;
    int nacimiento;
    
        System.out.println("Introduce el año actual ");
            year=sc.nextInt();
        System.out.println("Introduce el año de nacimiento");
            nacimiento=sc.nextInt();
        System.out.println("mi edad es " + (year - nacimiento) );
        
}
}
