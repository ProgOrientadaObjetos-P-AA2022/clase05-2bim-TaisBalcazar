/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class Principal {

    public static void main(String[] args) {

        TarjetaCredito t1 = new TarjetaCredito("Visa", "7T7B", 15000);
        MayorEdad representante = new MayorEdad("José", t1);

        MenorEdad menor = new MenorEdad("Felipe", representante);

        System.out.printf("Nombre: %s\n"
                + "Tarjeta: %s - %s - %.2f",
                menor.obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNombre(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCodigo(),
                menor.obtenerRepresentante().obtenerTarjeta().obtenerCupoMaximo());

    }
}
