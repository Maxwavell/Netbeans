/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysdinamicos;

import java.util.*;

/**
 *
 * @author Medac
 */
public class ArraysDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(new Persona("juan", 18));
        personas.add(new Persona("juan", 18));
        personas.add(new Persona());
        personas.add(new Persona("juan", 18));
        personas.add(new Persona("juan", 18));
        /*
         for(Persona p:personas){
             if (p.getNombre()==null) {
                 p.setNombre("Emilio");
                 p.setEdad(24);
             }
}
                 
        System.out.println(personas);              
             
        
        
       
        Persona p=new Persona();
        int pos = personas.indexOf(p);
        Persona p1 = new Persona ("juan",18);
        personas.set(pos,p1);
         /*
        Otra forma de hacerlo
         */

        ArrayList<Integer> numeros = new ArrayList();

        numeros.add(8);
        numeros.add(5);
        numeros.add(6);
        numeros.add(7);
        numeros.add(2);
        
        System.out.println(numeros);
        Collections.sort(numeros);
        System.out.println(numeros);

    }

}
