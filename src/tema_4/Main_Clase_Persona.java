package tema_4;

public class Main_Clase_Persona {
    public static void main(String[] args){
        //Crear un objeto de la clase Persona
        Clase_Persona persona1=new Clase_Persona();

        //Asignar valores a los atributos
        persona1.nombre="Carlos";
        persona1.edad=30;

        //Moatrar la información de la persona
        persona1.mostrarInformacion();

        //Cumplir años (incrementar la edad)
        persona1.cumplirAños();

        //Mostrar la información actualizada de la persona
        System.out.println("Después de cumplir años: ");
        persona1.mostrarInformacion();
    }
}
