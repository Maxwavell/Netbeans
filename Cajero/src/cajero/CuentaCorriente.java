/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

/**
 *
 * @author Medac
 */
public class CuentaCorriente 
{
//Atributos
     String nombre = "Introduce un nombre";
     double saldo = 0.0 ;
     String dni = "Introduce un DNI";
     double límite = -50.0;
 //Constructores
        public CuentaCorriente()
            {
                
            }    
        CuentaCorriente(String nombre , String dni)
            {
                this.nombre = nombre;
                this.dni = dni;
                saldo = 0.0;
                límite = -50.0;
            }
        CuentaCorriente(double saldo)
            {
                this.saldo = 0.0;
                nombre = nombre;
                dni = dni;
                límite = -50.0;
            }
        CuentaCorriente(double saldo , String nombre , String dni , double límite)
            {
                this.saldo = saldo;
                this.nombre = nombre; 
                this.dni = dni;
                this.límite = límite;
            }        
    //Métodos   
    void ingresar(double ingreso)
        {
            saldo = saldo + ingreso;
        }
    void SacarDinero(double sacado)
        {
            if (saldo - sacado < límite) 
                {
                    System.out.println("No se puede");
                }
            else
                {
                    saldo = saldo -= sacado;
                }
        }
        
    void mostrar ()
        {
            System.out.println("Tu Nombre es: " + nombre);
            System.out.println("Tu Saldo es: " + saldo);
            System.out.println("Tu límite negativo es: " + límite);
            System.out.println("Tu DNI es: " + dni);
        }    
}
