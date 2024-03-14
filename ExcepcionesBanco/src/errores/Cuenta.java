/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package errores;

/**
 *
 * @author Medac
 */
public class Cuenta {
    public String nombre;
    int numero;
    double saldo;

    public Cuenta(String nombre, int numero, double saldo) throws SaldoInsuficienteException {
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
        
        if (saldo < 0) {
            throw new SaldoInsuficienteException("Saldo Inicial negativo");
        }
        this.nombre = nombre;
        this.numero = numero;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "nombre=" + nombre + ", numero=" + numero + ", saldo=" + saldo + '}';
    }
    
    public void movimiento(double valor) throws SaldoInsuficienteException {
        if (saldo + valor < 0) {
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        saldo = +valor;
}
}