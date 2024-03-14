/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hostias;

import java.util.Set;

/**
 *
 * @author Medac
 */
public class Jugador 
{
    //Atributos
        private String nombre;
        private int vida;

    //Constructores
        public Jugador()
            {
                
            }    
       Jugador(String nombre , int vida)
            {
                this.nombre = nombre;
                this.vida = 5;
            }
    //Métodos
       
       //Métodos conseguir nombre
       public String getNombre()
            {
                return nombre;
            }
       //Métodos conseguir vidas
       public int getVida()
            {
                return vida;
            }
       //Método enfrentar jugadores
       public void luchar(Jugador jugador)
            {
               int v=jugador.getVida():
               
               jugador.setVida(v-1);
                
            }
       //Método para cambiar vida
       public void setVida(int vida)
            {
                this.vida=vida;
            }
       //Meto para cambiar nombre
       public void setNombre(String nombre)
            {
                this.nombre=nombre;
            }
       @Override
       public String toString()
       {
           return "nombre: "+nombre+" vida: "+vida;
       }
}
