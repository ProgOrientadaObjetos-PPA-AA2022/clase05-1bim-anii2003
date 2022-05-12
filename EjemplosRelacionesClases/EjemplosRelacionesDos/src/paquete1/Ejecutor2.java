/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String b;
        String nombre;
        String ced;

        System.out.println("Ingrese el nombre del barrio: ");
        b = leer.nextLine();

        // Crear un objeto de tipo Barrio
        Barrio bar1 = new Barrio(b);

        // Crear un objeto de tipo persona  
        System.out.println("Ingrese el nombre de la persona: ");
        nombre = leer.nextLine();
        
        System.out.println("Ingrese el número de cédula: ");
        ced = leer.nextLine();
        
        // Crear un objeto de tipo Persona
        Persona p1 = new Persona(nombre, ced, bar1);
        
        // Presentar la representación del objeto Persona
        System.out.printf("%s\n",p1);
        
    }
}
