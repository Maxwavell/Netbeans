/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hostias;

/**
 *
 * @author Medac
 */
public class Hostias 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      
        Jugador j1 = new Jugador("Alfonso", 5);
        Jugador j2 = new Jugador("Monico", 5);
        
        do{
         int a = (int) (Math.random()*2);
         int b = (int) (Math.random()*2);
         
            if (a==0) {
                j1.luchar(j2);  
            }
            else{
                j2.luchar(j1);
            }
         
            
        } while (j1.getVida() > 0 && j2.getVida() > 0);
                    
        if (j1.getVida() == 0) {
            System.out.println("Has ganado: " + j2.toString());  
        }
        else{
            System.out.println("Has ganado:" + j1.toString());
        }


    }   
}
