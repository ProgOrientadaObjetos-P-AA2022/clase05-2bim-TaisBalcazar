/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete06;

/**
 *
 * @author SALA I
 */
public class TarjetaCredito {

    private String nombre;
    private String codigo;
    private double cupoMaximo;

    public TarjetaCredito(String n, String c, double cM) {
        nombre = n;
        codigo = c;
        cupoMaximo = cM;

    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCodigo(String n) {
        codigo = n;
    }

    public void establecerCupoMaximo(double n) {
        cupoMaximo = n;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCodigo() {
        return codigo;
    }

    public double obtenerCupoMaximo() {
        return cupoMaximo;
    }

}
