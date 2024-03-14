/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // TODO code application logic here
  /*      
        String Texto1="Hola";
        String Texto2="Que tal";
        String Texto3= Texto1 + Texto2;
        String Texto4= "Holas";
            System.out.println(Texto1);
            System.out.println(Texto2);
            System.out.println(Texto3);
            System.out.println(Texto1.equals(Texto4));
            System.out.println(Texto3.length());
            System.out.println(Texto1.indexOf('H'));
            System.out.println(Texto3.indexOf('a'));
            System.out.println(Texto2.charAt(2));
            System.out.println(Texto1.substring(0,2));
            System.out.println(Texto1.toUpperCase());
*/
  String Secreta="control";
  String Intento;
        System.out.println("la primera letra de la palabra secreta es: "+(Secreta.charAt(0))+" su ultima letra es: "+(Secreta.charAt(Secreta.length()-1))+" Introduce la palabra secreta");
        Intento=sc.nextLine();
        
        while(Intento!=Secreta){ System.out.println("Incorrecto vuelve a intentarlo "+"la primera letra es: "+(Secreta.charAt(0))+" la ultima letra es: "+(Secreta.charAt(Secreta.length()-1)));
        Intento=sc.nextLine();
        }
    }
}

    