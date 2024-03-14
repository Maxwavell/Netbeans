/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p4_corregida;

/**
 *
 * @author Medac
 */
public class P4_Corregida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Creación de los objetos en el main
           Coche coche = new Coche();
        
           Moto moto = new Moche();
        
           Camion camion = new Camion();
           
        //Array de Objetivos 
        String [] cartas_objetivo = {"1 camión 2 moto","1 moto 2 camión","1 coche 2 moto"};
        
        
        // Asignaciones manuales puede mejorarse.
        System.out.println("El camion tiene " + cartas_objetivo[0]);
        System.out.println("El camion tiene " + cartas_objetivo[1]);
        System.out.println("El camion tiene " + cartas_objetivo[2]);
        
        //Creación de la pista
        Vehiculo [][] pista new = Vehiculo [3][10];
        
        //Asignación de los vehículos dentro de la pista
        pista[coche.getPosx][coche.getPosy] = coche;
        pista[moto.getPosx][coche.getPosy] = moto;
        pista[camion.getPosx][coche.getPosy] = camion;
        
        
    }
    
    //Terminar metodo mostrar
  public static void mostrar(vehiculo[][] pista){
      for (int i = 0; i < pista.length; i++) {
          
      }
  }  
}
