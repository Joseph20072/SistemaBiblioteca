
package modelos;

public class Libro {
    private String isbn;
    private String titulo;
    private String autor;
    private String genero;
    private int aniopublicacion;
    private boolean disponible;

    
    public String getIsbn() {
        return isbn;
    }

   
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

   
    public String getTitulo() {
        return titulo;
    }

   
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

   
    public String getAutor() {
        return autor;
    }

    
    public void setAutor(String autor) {
        this.autor = autor;
    }

   
    public String getGenero() {
        return genero;
    }

    
    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    public int getAniopublicacion() {
        return aniopublicacion;
    }

   
    public void setAniopublicacion(int aniopublicacion) {
        this.aniopublicacion = aniopublicacion;
    }

   
    public boolean isDisponible() {
        return disponible;
    }

   
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    @Override
            public String toString(){
            
                return "Libro[Isbn:" + isbn + " Titulo:" + titulo +" Autor:" + autor +" Genero:" + 
                        genero +" Año de publicacion:" + aniopublicacion +" Disponible:" + disponible + "]";
            }
    
    
}

