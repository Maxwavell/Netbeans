/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonizadordigital;

/**
 *
 * @author Medac
 */
public class SintonizadorFM 
{
    //Atributos
    private double frecuencia;
    //Constructor
    SintonizadorFM()
            {
                frecuencia = 80;
            }
    SintonizadorFM(double frecuencia)
            {
               this.frecuencia = frecuencia;
            }            

    //Metodo para subir frecuencia
    void subir()
        {
            
            if (0.5 + frecuencia > 108) 
            {
                frecuencia = 80;
            }
            else
            {
                frecuencia = 0.5 + frecuencia;
            }    
        }

    //Método para bajar frecuencia
    void bajar()
        {
            if (frecuencia - 0.5 < 80) 
            {
                frecuencia = 108;
            }
            else
            {
                frecuencia = frecuencia - 0.5;
            }    
        }  
    

    
}