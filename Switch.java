package Ejercicios;
import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner N = new Scanner(System.in);
		System.out.println("Ingrese Temperatura en Grados C°");
		Scanner sc = new Scanner(System.in);
		int num = Integer.parseInt(sc.nextLine());
        switch ((-100 <= num && num <= 0 ) ? 0 :
                (1 <= num && num <= 10) ? 1:
                (11 <= num && num <= 15) ? 2:
                (16 <= num && num <= 20) ? 3:4) {
		case 0:
		    System.out.println("Hace mucho frio, bajo cero");
		    break;
		case 1:
		    System.out.println("Hace frio, pero sobre cero");
		    break;
		case 2:
			System.out.println("Hace algo de frio");	
			break;
		case 3:
		    System.out.println("No hace frio, esta agradable");	
		    break;
		case 4:
			System.out.println("No hace frio, hace calor");
		}
	}


	}


