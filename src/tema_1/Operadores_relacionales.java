package tema_1;

public class Operadores_relacionales {
	public static void main(String[] args) {
	    int a = 10;
	    int b = 5;
	    boolean igual = (a == b); // false
		System.out.println("a == b => " + igual);
		boolean noigual = (a != b); //true
		System.out.println("a != b => " + noigual);
		boolean mayor = (a > b); //true
		System.out.println("a > b => " + mayor);
		boolean menor = (a < b); // false
		System.out.println("a < b => " + menor);
		boolean mayorigual = (a >= b); // true
		System.out.println("a >= b => " + mayorigual);
		boolean menorigual = (a <= b); // false
		System.out.println("a <= b => " + menorigual);
	}

}
