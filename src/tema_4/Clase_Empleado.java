package tema_4;

public class Clase_Empleado {

    //Atributos privados
    private String nombre;
    private double salario;

    //Constructor
    public Clase_Empleado(String nombre, double salarioInicial){
        this.nombre=nombre;
        if (salarioInicial>=0){
            this.salario=salarioInicial;
        }else {
            this.salario=0.0;
        }
    }

    //Getter para el nombre
    public String getNombre(){
        return nombre;
    }

    //Getter para el salario
    public double getSalario(){
        return salario;
    }

    //Setter para el salario con validación
    public void setSalario(double nuevoSalario){
        if (nuevoSalario>=0){
            this.salario=nuevoSalario;
        }else{
            System.out.println("El salario no puede ser negativo.");
        }
    }

    //Método para mostrar información de empleado
    public void mostrarInformacion(){
        System.out.println("Empleado: "+nombre);
        System.out.println("Salario: "+salario);
    }
}
