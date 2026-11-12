package tema_4;

public class Clase_Coche {
    //Atributos
    String marca;
    String modelo;
    int año;

    //Constructor
    public Clase_Coche(String marca, String modelo, int año){
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }

    //Método para mostrar la informacion del coche
    public void mostrarInformacion(){
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Año: "+ año);
    }

}
