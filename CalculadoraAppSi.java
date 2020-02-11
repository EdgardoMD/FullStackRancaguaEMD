package Ejercicios;
import java.util.Scanner;

public class CalculadoraAppSi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=0, n2=0, suma=0, resta=0, mult=0, div=0, mod = 0;
		String s="?";
		
		Scanner LeerNumero = new Scanner(System.in);
		Scanner LeerSigno = new Scanner(System.in);
		
		System.out.println("Digite el primer número:");
		n1 = LeerNumero.nextInt();
		System.out.println("Digite el segundo número:");
		n2 = LeerNumero.nextInt();
		System.out.println("Digite el signo correspondiente a la operacion que desea realizar: (+ - * / %)");
		s = LeerSigno.next();
	
		
		if (s.contentEquals("+")) {
			suma= n1 + n2;
			System.out.println("La suma da como resultado: " + suma);
			} else
	    if (s.contentEquals("-")) {
			resta= n1 - n2;
			System.out.println("La resta da como resultado: " + resta);
		    } else
		if (s.contentEquals("*")) {
			mult= n1 * n2;
			System.out.println("La multiplicación da como resultado: " + mult);
		    } else
		if (s.contentEquals("/")) {
			div= n1 / n2;
			System.out.println("La división da como resultado: " + div);
		    } else
		if (s.contentEquals("%")) {
			mod= n1 % n2;
		
		System.out.println("El resto o módulo de la división es " + mod);
            } else
            
	    System.out.println("No ha ingresado datos correctos, reinicie ");


	}

}
