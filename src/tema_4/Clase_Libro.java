package tema_4;

public class Clase_Libro {
    //Atributos
    String titulo;
    String autor;
    int numeroPaginas;

    //Constructor
    public Clase_Libro(String titulo, String autor, int numeroPaginas){
        this.titulo=titulo;
        this.autor=autor;
        this.numeroPaginas=numeroPaginas;
    }

    //Método para mostrar la informacion del libro
    public void mostrarInformacion(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Número de páginas: "+numeroPaginas);
    }
}
