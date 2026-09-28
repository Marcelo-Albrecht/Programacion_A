package tema_1;

public class Operadores_lógicos {
	public static void main(String[] args) {
	    boolean a = true;
	    boolean b = false;
	    boolean and = a && b; // false
		System.out.println("a && b =>" + and);
		boolean or = a || b; //true
		System.out.println("a || b =>" + or);
		boolean not = !a; // false
		System.out.println("!a =>" + not);
	}

}
