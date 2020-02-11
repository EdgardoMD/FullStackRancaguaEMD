/*2)Estructure un Array de números donde le indicamos por teclado el tamaño del Array, 
rellenaremos el Array con números aleatorios entre 0 y 9, al final muestra  por  pantalla  
el  valor  de  cada  posición  y  la  suma  de  todos  los valores. Haz un método para rellenar 
el Array (que tenga como parámetros los números entre los que tengaque generar), para mostrar el contenido 
y la suma del Array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).*/

package Ejercicios;

import java.util.Scanner;

public class Ej_2_30_01 {

	public static void main(String[] args) {
		
		
		int tamanio = 0;
		int [] arreglo2= new int[tamanio];
		Scanner ingresar = new Scanner(System.in);
		System.out.println("Ingrese el tamaño del arreglo: ");
		tamanio=ingresar.nextInt();
		
		int dato=0;
		for (int j=0; j<arreglo2.length; j++)
		{
			arreglo2[j]=dato;
			System.out.println(" valor--- ["+j+"]: "+dato);
			
		}
	    
		System.out.println(arreglo2.length);
		

	}

}
