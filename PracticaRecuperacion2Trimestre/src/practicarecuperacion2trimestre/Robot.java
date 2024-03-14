/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicarecuperacion2trimestre;

/**
 *
 * @author Medac
 */
public abstract class Robot {

    protected int potencia;
    protected int bateria;
    protected char señal;
    protected int posicionx;
    protected int posiciony;

    public Robot(int potencia, int bateria, char señal) {
        this.potencia = potencia;
        this.bateria = bateria;
        this.posicionx = 0;
        this.posiciony = 0;
    }

    public abstract void avanzar();

    public abstract void retroceder();

    public abstract void EjecutarAccion();

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public char getSeñal() {
        return señal;
    }

    public void setSeñal(char señal) {
        this.señal = señal;
    }

    public int getPosicionx() {
        return posicionx;
    }

    public void setPosicionx(int posicionx) {
        this.posicionx = posicionx;
    }

    public int getPosiciony() {
        return posiciony;
    }

    public void setPosiciony(int posiciony) {
        this.posiciony = posiciony;
    }

    @Override
    public String toString() {
        return  "posicion:" + posicionx + "|" + posiciony + "Batería:" + bateria;
    }

}
