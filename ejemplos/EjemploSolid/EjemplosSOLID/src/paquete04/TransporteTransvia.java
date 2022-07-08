/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete04;

/**
 *
 * @author UTPL
 */
public class TransporteTransvia extends Transporte {
     private String cooperativaTransvia;

    public void establecerCooperativaTransvia(String n) {
       cooperativaTransvia = n;
    }

    @Override
    public void establecerTarifa() {
        tarifa = 2.00 + 0.50;
    }

    public String obtenerCooperativaTransvia() {
        return cooperativaTransvia;
    }
}
