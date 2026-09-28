package tema_1;

public class Casting_explícito {
	public static void main(String[] args) {
	    double numeroDecimal = 9.78;
	    // Casting explícito de double a int 
	    int numeroEntero = (int) numeroDecimal;
	    System.out.println("Numero decimal: " + numeroDecimal); // 9.78
	    System.out.println("Numero entero: " + numeroEntero);  // 9 (pérdida de datos decimales)
	    
	}

}
