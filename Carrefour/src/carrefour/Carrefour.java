/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrefour;

import java.util.*;

/**
 *
 * @author Medac
 */
public class Carrefour {
// Comprar 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lavadora l1 = new Lavadora("Limpiatocho", "LG", 1, 200);
        Lavadora l2 = new Lavadora("Limpiatochoplus", "LG", 1, 300);
        Congelador c1 = new Congelador("Congelatocho", "LG", 1, 350);
        Congelador c2 = new Congelador("Congelatochoplus", "LG", 1, 260);
        Nevera n1 = new Nevera("Enfriatocho", "LG", 1, 180);
        Nevera n2 = new Nevera("Enfriatochoplus", "LG", 1, 170);
        
        Electrodomestico[] catalogo = {l1,l2,c1,c2,n1,n2};
        Electrodomestico[] cesta = new Electrodomestico[10]; 
        Scanner sc = new Scanner(System.in);

        boolean salir = true;
        System.out.println("======================= ==================");
        System.out.println("Bienvenido a Electrodomesticos Carrefour");
        System.out.println("=========================================");
        System.out.println("Elige una opción:");
        System.out.println("Comprar electrodomestico");
        System.out.println("Salir");
        do {
            int boton = sc.nextInt();

            switch (boton) {
                case 1:
                    System.out.println("Introduce el nombre de ");
                    break;
                case 2:

                    break;

                default:
                    System.out.println("Numero Incorrecto vuelve a intentarlo");
            }
        } while (salir = false);
    }

}
