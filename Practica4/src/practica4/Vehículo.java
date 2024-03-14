/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4;

/**
 *
 * @author Medac
 */
public abstract class Vehículo {
    String nombre;
    int posx;
    int posy;
    int velocidad;
    protected Carta [] cartas;
    
    public Vehículo(String nombre, int posx, int posy) {
        this.nombre = nombre;
        this.posx = posx;
        this.posy = posy;
        cartas=new Carta[100];
    }
    
    
}
