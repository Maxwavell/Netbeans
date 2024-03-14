/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrefour;
import java.util.*;
/**
 *
 * @author Medac
 */
//lavadora potencia * 5
//nevera potencia * 10
// Congelador potencia * 20
public abstract class Electrodomestico {

 protected String nombre;
 protected String marca;
 protected int potencia;
 protected double precio;

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public Electrodomestico(String nombre, String marca, int potencia, double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.potencia = potencia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public abstract int consumo(int potencia);
    
}

