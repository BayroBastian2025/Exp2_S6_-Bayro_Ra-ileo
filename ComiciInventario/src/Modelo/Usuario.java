
package Modelo;


public class Usuario {
   private String nombre;
   private String rut;

    public Usuario(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    @Override
    public String toString() {
        return "Usuario: " + "nombre= " + nombre + ", rut= " + rut + '}';
    }
    
    
    
    
    
}
