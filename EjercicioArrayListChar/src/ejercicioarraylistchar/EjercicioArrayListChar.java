/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarraylistchar;

import java.util.*;

/**
 *
 * @author Medac
 */
public class EjercicioArrayListChar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       ArrayList<Character> listaletras = new ArrayList<Character>();
        System.out.println("Introduce un texto");
        String texto = sc.next();
        
        for (int i = 0; i < texto.length(); i++) {
            listaletras.add(texto.charAt(i));
                        
            
        }
        
        System.out.println(listaletras);
        
        
        ArrayList<Character> listaletras2 = new ArrayList<Character>();
        System.out.println("Introduce un texto");
        String texto2 = sc.next();
        
        for (int i = 0; i < texto2.length(); i++) {
            listaletras.add(texto2.charAt(i));
                        
            
        }
        
        System.out.println(listaletras2);
        
        listaletras.addAll(listaletras2);
        
        System.out.println(listaletras);
 
        
    }

}
