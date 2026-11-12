package tema_4;

public class Clase_CuentaBancaria {
    //Atributos privados (encapsulados)
    private String titular;
    private double saldo;

    //Constructor
    public Clase_CuentaBancaria(String titular){
        this.titular=titular;
        this.saldo=0.0;
    }
    //Getter para el saldo
    public double getSaldo() {
        return saldo;
    }

    //Getter para el titular
    public String getTitular(){
        return titular;
    }

    //Métodop para depositar dineiro
    public void depositar(double cantidad){
       if (cantidad>0){
        saldo += cantidad;
        System.out.println("Depósito realizado. Nuevo saldo: "+saldo);
       }else {
           System.out.println("La cantidad a depositar debe ser positiva.");
       }
    }
    //Método para retirar dinero
    public void retirar(double cantidad){
        if (cantidad>0 && cantidad<=saldo){
            saldo -=cantidad;
            System.out.println("Retiro realizado. Nuevo saldo: "+saldo);
        }else {
            System.out.println("Fondos insuficientes o cantidad no válida.");
        }
    }
    //Método para mostrar la información de la cuenta
    public void mostrarInformacion(){
       System.out.println("Titular: "+titular);
       System.out.println("Saldo: "+saldo);
    }


}
