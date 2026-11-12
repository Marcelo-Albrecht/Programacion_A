package tema_4;

public class Main_Clase_Empleado {
    public static void main(String[] args){
        //Crear un ibjeto de la clase Clase_Empleado
        Clase_Empleado empleado1=new Clase_Empleado("Carlos García", 3000);

        //Mostrar información del empleado
        empleado1.mostrarInformacion();

        //Intentar cambiar el salario con un valor negativo
        empleado1.setSalario(-500);
        System.out.println("Salario después de intento de cambio: "+empleado1.getSalario());

        //Cambiar el salario a un valor positivo
        empleado1.setSalario(3500);
        System.out.println("Salario actualizado: "+empleado1.getSalario());
    }
}
