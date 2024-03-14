/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package errores;

/**
 *
 * @author Medac
 */
public class ExcepcionesBanco { 

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c;
        String [] valores = { "pp", "-2500", "100"};
        try {
        c = new Cuenta ("Antonio", 25, -1000.0);
            System.out.println(c); }
         
        catch(SaldoInsuficienteException e1) {
            System.out.println(e1.getMessage());
    }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }//MAIN
    public static void procesarMovimientos(Cuenta c,  String [] valores) throws SaldoInsuficienteException{
        
        for (int i = 0; i < valores.length; i++) {
            c.movimiento(Double.parseDouble(valores[i]));
        }
    } 
}
