/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Persona> estudiantes = new ArrayList<>();

        Persona est1 = new Persona("Tais", 18);
        Persona est2 = new Persona("Paula", 14);
        Persona est3 = new Persona("Sandra", 51);
        Persona est4 = new Persona("Paul", 41);

        estudiantes.add(est1);
        estudiantes.add(est2);
        estudiantes.add(est3);
        estudiantes.add(est4);

        OperacionesEstudiantes operaciones = new OperacionesEstudiantes();
        operaciones.establecerEstudiante(estudiantes);
        operaciones.establecerPromedioEdades();

        System.out.printf("%s\n", operaciones);

    }
}
