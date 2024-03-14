/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicarecuperacion2trimestre;
import java.util.*;
/**
 *
 * @author Medac
 */
public class PracticaRecuperacion2Trimestre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Variable scanner
         Scanner sc = new Scanner(System.in);
        //Booleano del do While
         boolean salir = true;
         //Metodo mostrar
   

   
        //Array robots
        Robot[][] pista = new Robot[4][9]; 
        
        System.out.println("==========================================");
        System.out.println("Bienvenido Robo-limpiadores");
        System.out.println("=========================================");
        System.out.println("Elige un robot introduciendo un numero:");
        System.out.println("1 Robot mayordomo");
        System.out.println("2 Robot limpieza");
        
            
            int boton = sc.nextInt();
            RobotLimpieza rl1 = new RobotLimpieza(4,20,'L');
            RobotMayordomo rm1 = new RobotMayordomo(3,15,'M');
            
            switch (boton) {
                case 1:
                    do {
                    System.out.println("¿Que quieres hacer con el robot?");
                    System.out.println("1.Avanzar 2.Retroceder 3.Accion 4.Mostrar");
                        int boton1 = sc.nextInt();
                        switch(boton1) {
                            case 1: 
                                System.out.println("Avanza");
                                rm1.avanzar();
                                break;
                            case 2:
                                System.out.println("Retrocede");
                                rm1.retroceder();
                                break;
                            case 3:
                                rm1.EjecutarAccion();
                                break;
                            case 4:
                                System.out.println(rm1);
                                break;
                        }
                            
                    } while (rm1.getBateria()>0);
                    break;
                    
                case 2:
                    do {
                    System.out.println("¿Que quieres hacer con el robot?");
                    System.out.println("1.Avanzar 2.Retroceder 3.Accion 4.Mostrar");
                        int boton1 = sc.nextInt();
                        switch(boton1) {
                            case 1: 
                                System.out.println("Avanza");
                                rl1.avanzar();
                                break;
                            case 2:
                                System.out.println("Retrocede");
                                rl1.retroceder();
                                break;
                            case 3:
                                rl1.EjecutarAccion();
                                break;
                            case 4:
                                System.out.println(rl1);
                                break;
                            
                        }
                            
                    } while (rl1.getBateria()>0);
                    break;

                default:
                    System.out.println("Numero incorrecto vuelva a intentarlo.");                                                                     
                  
            }
       
    }
    
}
