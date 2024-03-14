/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarecuperacion2trimestre;

/**
 *
 * @author Medac
 */
public class RobotMayordomo extends Robot {

    public RobotMayordomo(int potencia, int bateria, char señal) {
        super(potencia, bateria, señal);
    }

    @Override
    public void avanzar() {
        int avance1 = posicionx + 5;
        int avance2 = posiciony + 5;
        posicionx = avance1;
        posiciony = avance2;
    }

    @Override
    public void retroceder() {
       int retroceso1 = posicionx - 2;
       int retroceso2 = posiciony - 2;
        if (retroceso1 > 0) {    
            posicionx = retroceso1;
            posiciony = retroceso2;
            
        }
    }

    @Override
    public void EjecutarAccion() {
    int resta = bateria - potencia*2;
        bateria = resta;
        System.out.println("Cogiendo...");
    }
    
}
