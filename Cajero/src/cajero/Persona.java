/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Medac
 */
public class Persona 
{
    
    //Atributos
        String nombre;
        int edad;
        String dni;
        // String email;
    //Constructores
        Persona()
        {
            System.out.println("Has creado una persona");
        }
        Persona(String nombre , int edad , String DNI)
            {
                this.nombre = "paco cruz";
                this.edad = 6;
                this.dni = "1287491827B";
            }
                
    //Métodos   
    void saludar()
        {
            System.out.println(nombre + "Hola que tal");
        }
    void comer()
        {
            System.out.println("Estoy comiendo");
        }
        
    void incrementar (int num)
        {
            edad=edad+num;
            
        }
    void pintar (){
        System.out.println(this.edad+this.nombre+this.dni);
    }
            
}
