/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioarraylistpacientes;

/**
 *
 * @author Medac
 */
public class Paciente implements Comparable<Paciente> {

    int id;
    static int cont = 0;
    String nombre;
    int edad;

    public Paciente(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public int compareTo(Paciente p) {

        return (edad - p.edad);
    }

}
