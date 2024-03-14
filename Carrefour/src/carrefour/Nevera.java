/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrefour;

/**
 *
 * @author Medac
 */
public class Nevera extends Electrodomestico{

    public Nevera(String nombre, String marca, int potencia, double precio) {
        super(nombre, marca, potencia,precio);
    }

    @Override
    public int consumo(int consumo) {
        consumo = potencia * 10;
        return consumo;
    }
    
}
