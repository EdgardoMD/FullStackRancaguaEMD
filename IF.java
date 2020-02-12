package Ejercicios;
import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class IF {
	public static void main(String[] args) {
		int i =0, contadorNegativos =0, contadorPositivos=0, contadorCeros=0;
		LinkedList<Integer> lista =new LinkedList<Integer>();
		Scanner leer = new Scanner(System.in);
		do {  
			try{ 
				System.out.println("Ingrese un numero: ");
			    lista.add(leer.nextInt());
			    i++;
			   } 
			catch(InputMismatchException exception) { 
				System.out.println("El valor ingresado no es numerico"); 
				leer.nextLine();
			   }   
		}while(i<10);
		for(int x=0;x<lista.size();x++) {
			if(lista.get(x)<0) {
				contadorNegativos += 1;
			}
			else if(lista.get(x)>0) {
				contadorPositivos += 1;
			}
			else if(lista.get(x)==0) {
				contadorCeros += 1;
			}
		}
		System.out.println("Numeros positivos: "+Integer.toString(contadorPositivos));
		System.out.println("Numeros negativos: "+Integer.toString(contadorNegativos));
		System.out.println("Numeros cero: "+Integer.toString(contadorCeros));
		leer.close();
	}

}
