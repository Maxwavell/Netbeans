/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo;
import CuentaCorriente;
/**
 *
 * @author Medac
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  Persona persona1 = new Persona();
  Persona persona2 = new Persona();
  persona1.nombre = "Juan";
  persona1.edad = 18;
  persona1.dni = "127361A";
  persona1.email = "juanitocruz@gmail.com";
  persona1.saludar();
  
  persona2.nombre = "Alberto";
  persona2.edad = 21;
  persona2.dni = "127361B";
  persona2.email = "Albertocruz@gmail.com";
  persona2.saludar();

  CuentaCorriente cc = new CuentaCorriente();



    }
    
}
