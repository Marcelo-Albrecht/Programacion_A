package tema_1;

public class Operadores_bit_a_bit {
	public static void main(String[] args) {
	    int a = 5; // 0101 en binario
	    int b = 3; // 0011 en binario
	    int and = a & b; // 0001, que es 1
	    System.out.println("a & b => " + and);
	    int or = a | b; // 0111, que es 7
	    System.out.println("a | b => " + or);
	    int xor = a ^ b; // 0110, que es 6
	    System.out.println("a ^ b => " + xor);
	    int complemento = ~a; // 1010 en binario (en complemento a dos), que es -6
	    System.out.println("~a => " + complemento);
	    int desplazaizq = a << 1; // 1010 en binario, que es 10
	    System.out.println("a << 1 => " + desplazaizq);
	    int desplazader = a >> 1; // 0010 en binario, que es 2
	    System.out.println("a >> => 1 " + desplazader);
	    int desplazadersinsigno = a >>> 1; // 0010 en binario, que es 2
	    System.out.println("a >>> 1  => " + desplazadersinsigno);
		
	}

}
