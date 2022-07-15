/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10;

/**
 *
 * @author SALA I
 */
public class Principal02 {

    public static void main(String[] args) {
        // Guardar los objetos de tipo Generador Pelicular en un 
        // archivo serializado
        String nombreArchivo = "Generadores.data";

        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");

        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(api);
        gp.establecerUrl("http://api.movie?api=");
        System.out.println("NETFLIX\n");
        System.out.println(gp.obtenerUrl());

        System.out.println("---------------------------");

        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");

        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println("AMAZON MOVIE \n");

        System.out.println(gp2.obtenerUrl());

        System.out.println("---------------------------");

        APIDirectvGo api3 = new APIDirectvGo();
        api3.establecerApiKey("110022");

        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api3);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println("DIRECTV GO\n");

        System.out.println(gp3.obtenerUrl());

        System.out.println("---------------------------");

        APIStarPlus api4 = new APIStarPlus();
        api4.establecerApiKey("123789");

        GeneradorPeliculas gp4 = new GeneradorPeliculas();
        gp4.establecerLlave(api4);
        gp4.establecerUrl("http://api.movie?api=");
        System.out.println("STAR PLUS\n");
        System.out.println(gp4.obtenerUrl());

        ArchivoEscritura archivo = new ArchivoEscritura(nombreArchivo);
        archivo.establecerGeneradores(gp);
        archivo.establecerSalida();
        archivo.establecerGeneradores(gp2);
        archivo.establecerSalida();
        archivo.establecerGeneradores(gp3);
        archivo.establecerSalida();
        archivo.establecerGeneradores(gp4);
        archivo.establecerSalida();

    }
}
