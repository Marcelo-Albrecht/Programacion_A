package tema_1;

public class Casting_implícito {
	public static void main(String[] args) {
	    int numeroEntero = 100;
	    // Casting implícito de int a long y de int a double
	    long numeroLargo = numeroEntero;
	    double numeroDecimal = numeroEntero;
		System.out.println("Número entero: " + numeroEntero); // 100
		System.out.println("Número largo: " + numeroLargo); // 100
		System.out.println("Número decimal: " + numeroDecimal); // 100.0
	}

}
