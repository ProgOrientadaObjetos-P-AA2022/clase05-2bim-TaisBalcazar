/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author USUARIO
 */
public class Principal03 {
     public static void main(String[] args) {
        String nombreArchivo = "Generadores1.data";
        ArchivoLectura lectura= new ArchivoLectura(nombreArchivo);
        lectura.establecerGeneradores();
        System.out.println(lectura);

    }
}
