/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraylist;

import java.util.*;

/**
 *
 * @author Medac
 */
public class ChuletaArrayList {

    /*          *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Integer> numeros = new ArrayList<Integer>();
        System.out.println(numeros.size());
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);

        // añadir a una posicion especifica posición izquierda//numero derecha
        numeros.add(1, 4);

        System.out.println(numeros);
        System.out.println(numeros.size());

        LinkedList<String> arraylink = new LinkedList<>();
        arraylink.add("Pepe");
        arraylink.add("Juan");
        arraylink.add(1,"Elena");
        arraylink.remove(0);

        
        ArrayList<Persona> personas = new ArrayList<Persona>();
    }

}
