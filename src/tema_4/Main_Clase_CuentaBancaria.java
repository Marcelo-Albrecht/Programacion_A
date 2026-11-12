package tema_4;

public class Main_Clase_CuentaBancaria {
    public static void main(String[] args){
      //Crear un  objeto de la clase Clase_CuentaBancaria
        Clase_CuentaBancaria cuenta1=new Clase_CuentaBancaria("Ana Pérez");

        //Intentar modificar directamente el saldo (esto no es posible debido a la encapsulación)
        //cuenta1.saldo=1000; //Esto dará error

        //Usar los métodos para interactuar con los atributos encapsulados
        cuenta1.depositar(500);
        cuenta1.retirar(200);
        System.out.println("Saldo final: "+cuenta1.getSaldo());


    }
}
