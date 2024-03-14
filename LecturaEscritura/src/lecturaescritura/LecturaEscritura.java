/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturaescritura;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Medac
 */
public class LecturaEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String frase = "";
        String frase2 = "";
        File file = new File("C:/MEDAC/inspector.txt");
        // char salva [] = new char [20];
        // int contador = 0;
        try { FileReader fileReader = new FileReader (file);
        
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        frase = bufferedReader.readLine();
        while(frase!=null){
        frase2 = frase2 + frase + '\n'; 
        frase = bufferedReader.readLine();
        }
            System.out.println(frase2);     
            /**
         int  num = fileReader.read();
         char  letra = (char)num ;
               
         
         
            while(num!=-1){
                
            letra=(char)num;
            System.out.print(letra);
            num = fileReader.read();}
            salva[contador] = letra;
            contador++;
             **/
            
        
        
        bufferedReader.close();    
        }
        
        catch(IOException e){
            System.out.println("Error Al leer Archivo");}  
        
        try {
            FileWriter fileWriter = new FileWriter(file, true       );
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("hola");
            bufferedWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(LecturaEscritura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
