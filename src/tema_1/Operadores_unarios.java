package tema_1;

public class Operadores_unarios {
	public static void main(String[] args) {
	    // Asignamos las variables con los operadores unarios
	    int a = 10;
	    System.out.println("Valor inicial de a: " + a);
	    int b = -a;
	    int c = ++a; //a ahora es 11, c es 11
	    System.out.println("Valor actual de a: " + a); // 11
	    int d = a--; // d es 11, a ahora es 10
	    System.out.println("Valor actual de a: " + a); // 10
	    boolean e = true;
	    boolean f = !e; // false
	    // Mostramos los valores por consola
	   	System.out.println("Valor de b: " + b); // -10
	   	System.out.println("Valor de c: " + c); // 11
	   	System.out.println("Valor de d: " + d); // 11
	   	System.out.println("Valor de e: " + e); // true
	   	System.out.println("Valor de f: " + f); // false
	}

}
