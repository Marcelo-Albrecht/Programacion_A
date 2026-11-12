package tema_4;

public class Main_Clase_Coche {
    public static void main(String[] args){
        //Crear una instancia de la clase Clase_Coche
        Clase_Coche coche1=new Clase_Coche("Toyota", "Cotolla", 2020);

        //Moatrar la información del coche
        coche1.mostrarInformacion();

        //Acceder un atributo del objeto
        System.out.println("Marca del coche: "+coche1.marca);

        //Modificar un atributo del objeto
        coche1.año=2022;
        System.out.println("Nuevo año del coche: "+coche1.año);

    }
}
