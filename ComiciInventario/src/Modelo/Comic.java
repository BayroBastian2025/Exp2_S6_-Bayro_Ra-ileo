
package Modelo;



public class Comic {
    private String titulo;
    private String autor;

    public Comic(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Comic: " + "titulo= " + titulo + ", autor= " + autor + '}';
    }
    
    
    
}
