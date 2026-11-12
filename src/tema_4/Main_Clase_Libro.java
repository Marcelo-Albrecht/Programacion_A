package tema_4;

public class Main_Clase_Libro {
    public static void main(String[] args){
        //Crear una instancia de la clase Clase_Libro
        Clase_Libro libro1=new Clase_Libro("Cien Años de Soledad", "Gabriel García Márquez", 417);

        //Moatrar la información del libro
        libro1.mostrarInformacion();

        //Acceder a un atributo del objeto
        System.out.println("Título del libro: "+libro1.titulo);

        //Modificar un atributo del objeto
        libro1.numeroPaginas=500;
        System.out.println("Nuevo número de páginas: "+libro1.numeroPaginas);
    }
}
