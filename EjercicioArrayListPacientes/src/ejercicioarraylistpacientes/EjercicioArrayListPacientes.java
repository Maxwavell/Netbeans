/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioarraylistpacientes;

import java.util.*;

/**
 *
 * @author Medac
 */
public class EjercicioArrayListPacientes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
        Scanner sc = new Scanner(System.in);
        boolean seguir=true;
        boolean seguir2=true;
        System.out.println("Bienvenido al visor de pacientes");
        System.out.println("1. Introducir Pacientes");
        System.out.println("2. Ordenar por edad");
        System.out.println("3. Mostrar lista");

        int boton = sc.nextInt();
        do {
            switch (boton) {

                case 1:
                    int boton2=sc.nextInt();
                    do {
                    switch (boton2) {
                        case 1:
                           
        System.out.println("1 Introducir paciente");
        System.out.println("2 Salir");
        boton=sc.nextInt();
                            System.out.println("Introduce Nombre");
                            String nombre = sc.next();
                            System.out.println("Introduce edad");
                            int edad = sc.nextInt();

                            pacientes.add(new Paciente(nombre, edad));
                            break;
                        case 2:
                            boolean seguir2=false;
                            break;
                        default:
                            System.out.println("Valor Incorrecto");
                            break;
                            } while (seguir2 = true);
                   
                case 2:
                    Collections.sort(pacientes);
                case 3:
                    System.out.println(pacientes);
                    break;

                default:
                // Default secuencia de sentencias.
                } while (seguir = true);
            }
        
    }

}
