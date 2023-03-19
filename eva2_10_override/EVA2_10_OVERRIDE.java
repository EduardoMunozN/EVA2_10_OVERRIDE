/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.eva2_10_override;

/**
 *
 * @author eduar
 */
public class EVA2_10_OVERRIDE {

    public static void main(String[] args) {
        Persona persona = new Persona ();
        Persona persona2 = new Persona ("Eduardo Muñoz",50);
        System.out.println(persona);
        System.out.println(persona2);
        
        
    }
}
class Persona{
    private String nombre;
    private int edad;

    public Persona() {
      this.nombre = "______";
      this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    @Override
    public String toString(){
        //NO ESTAMOS INVOCANDO EL MÉTODO SOBREESCRITO DE LA SUPERCLASE
        //AQUÍ ESTAMOS REEMPLAZANDO TOTALMENTE A toString DE LA SUPERCLASE
        String cade = "Datos: \n" +
                 "Nombre: "+ nombre + "\n" +
                 "Edad : "+ edad;
        return cade;
    }
    
    
    
    
}