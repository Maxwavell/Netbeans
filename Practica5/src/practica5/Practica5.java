/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5;
import java.util.Scanner;
/**
 *
 * @author Medac
 */
public class Practica5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    }
    
    //Scanner
    Scanner sc = new Scanner(System.in);
   
    
    //Variable opcion switch
     int i = sc.nextInt();
     File agenda = new File("agenda_dani.txt");
     File agenda = new File("agenda_dani.txt");
      switch(i){
                    case 1:
                        System.out.println("Crear paciente")
                        
                    case 2:
                        System.out.println("Ver paciente");
                      
                    case 3:
                        System.out.println("Sondaje");
                    case 4:
                        System.out.println("Salir");
                     
                    default:
                        System.out.println("Numero Introducido Incorrecto vuelvelo a intentar");
                      
                }
            }
}
