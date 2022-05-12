/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author DELL
 */
public class Autor {
    
    private String nombre;
    private String apellido;
    private String pasaporte;

    public Autor(String a, String b) {
        nombre = a;
        apellido = b;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerApellido(String n) {
        apellido = n;
    }
    
    public void establecerPasaporte(String pass){
        pasaporte = pass;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerPasaporte(){
        return pasaporte;
    }
}
