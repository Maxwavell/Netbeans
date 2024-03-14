/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlexcepciones;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class ControlExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
         int a = 5;
        int b = 0;
        
        try{
            System.out.println(a/b);
        }
        
        catch(ArithmeticException e){
        System.out.println("No se puede dividir entre 0");
        }
       
        
       int num;
       int [] array = {2,3,7};
        System.out.println("Introduce un numero");
        
        try{
        num = sc.nextInt();
            System.out.println(array[num]/num);
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    
}
