/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        // se crea un de tipo UnidadDVD
        String marca = "Toshiba";
        // Crear un objeto de tipo UnidadDVD
        UnidadDVD unidad = new UnidadDVD(marca);

        // se crea el objeto de tipo Computadora
        String procesador = "Intel";
        Computadora computadora = new Computadora(procesador, unidad);
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                computadora.obtenerTipoProcesador(),
                computadora.obtenerUnidadDvd().obtenerMarca());

        System.out.println("------------------------------------");
        UnidadDVD d = computadora.obtenerUnidadDvd();
        
        System.out.printf("Computadora:\nProcesador: %s\n"
                + "Unidad de DVD: %s\n",
                computadora.obtenerTipoProcesador(),
                d);
    }

}
