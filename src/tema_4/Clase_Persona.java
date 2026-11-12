package tema_4;

public class Clase_Persona {
    //Atributos
    String nombre;
    int edad;

    //Método para mostrar la información de la persona
    public void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
    //Método para actualizar la edad
    public void cumplirAños(){
        edad++;
    }
}
