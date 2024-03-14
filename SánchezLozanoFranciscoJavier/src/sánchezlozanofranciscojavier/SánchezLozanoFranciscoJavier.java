/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sánchezlozanofranciscojavier;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author Medac
 */
public class SánchezLozanoFranciscoJavier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Variable scanner
    Scanner sc=new Scanner(System.in);
//Creación de tablero interno.
    char tablero1[][];
    tablero1 = new char[10][10];
//Creación de tablero jugador.
    char tablero[][];
    tablero = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero1[i][j]=10;
            }
            
        }
//Rellenar tablero interno
//Rellenar de X    
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], 'X');
        }
//Rellenar de espacios en blanco
        for (int i = 0; i < 6; i++) {
            tablero[0][i]=' ';
        }
        tablero[1][5]=' ';
        for (int i = 5; i < 9; i++) {
            tablero[2][i]=' ';
        }
        for (int i = 0; i < 10; i++) {
            
        }
        for (int i = 2; i < 10; i++) {
           tablero[i][8]=' ';
        }
      

      

       
    
//Jugar

//Creación de variables
    boolean jugar=true;
    int movimiento;
    int posx=9;
    int posy=9;
    int vidas=3;
      //Donde empieza el jugador
      tablero[posx][posy]='O';
    //Mostrar tablero jugador
         for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
         
        do {
            
            System.out.println("¿Hacia donde quieres ir? 1.derecha, 2.izquierda, 3.arriba, 4.abajo");
            movimiento= sc.nextInt();
            
                switch(movimiento){
                    //posy++
                    case 1:
                    tablero[posx][posy]=' ';
                        if (posy+1<10||posy+1>0) { 
                            posy++;
                            
                        }
                        else{
                            vidas--;
                            System.out.println("has perdido una vida");
                            }
                    tablero[posx][posy]='O';
                    //Mostrar tablero jugador
         for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
                    break;
                    //posy--
                    case 2:
                   tablero[posx][posy]=' ';
                        if (posy-1<10||posy-1>0) { 
                            posy--;
                            
                        }
                        else{
                            vidas--;
                            System.out.println("has perdido una vida");
                            }
                    tablero[posx][posy]='O';
                    //Mostrar tablero jugador
         for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
                                                  }
                    break;  
                     //posx--
                    case 3:
                    tablero[posx][posy]=' ';
                        if (posx-1<10||posx-1>0) { 
                            posx--;
                            
                        }
                        else{
                            vidas--;
                            System.out.println("has perdido una vida");
                            }
                    tablero[posx][posy]='O';
                    //Mostrar tablero jugador
         for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
                                                  }
                    break;
                    //posx++
                    case 4:
                   tablero[posx][posy]=' ';
                        if (posx+1<10||posx+13
                                >0) { 
                            posy++;
                            
                        }
                        else{
                            vidas--;
                            System.out.println("has perdido una vida");
                            }
                    tablero[posx][posy]='O';
                    //Mostrar tablero jugador
         for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
                                                  }
                    break;   
                                                  }
                if ((tablero[0][0]=='O')) {
                    jugar=false;
                
            }
                } while (jugar&&vidas!=0);

       
    }
    
}

