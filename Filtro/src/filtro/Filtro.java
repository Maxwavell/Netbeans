/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filtro;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Medac
 */
public class Filtro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //File coger mensaje
        File diccionario = new File ("C:/MEDAC/Diccionario.txt");
        //File coger Diccionario
        File mensaje = new File ("C:/MEDAC/Mensaje.txt");
        
       
        try {
            //FileReader Diccionario
            FileReader frDiccionario = new FileReader (diccionario);
            //BufferReader Diccionario
            BufferedReader brDiccionario = new BufferedReader(frDiccionario);
            
            try {
                String strDiccionario = brDiccionario.readLine();
                System.out.println(strDiccionario);
            } catch (IOException ex) {
                Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        try {
            //FileReader Mensaje 
            FileReader frMensaje = new FileReader (mensaje);
            //BufferReader Mensaje
            BufferedReader brMensaje = new BufferedReader(frMensaje);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Filtro.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
