/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author UTPL
 */
public class TransporteTransvia {
    private String cooperativaTransvia;
    private double tarifa;

    public void establecerCooperativaTransvia(String n) {
        cooperativaTransvia = n;
    }

    public void establecerTarifa() {
        tarifa = 0.40 + (0.40 * 0.20);
    }

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

}
