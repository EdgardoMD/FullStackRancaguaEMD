/*2)Estructure un Array de n�meros donde le indicamos por teclado el tama�o del Array, 
rellenaremos el Array con n�meros aleatorios entre 0 y 9, al final muestra  por  pantalla  
el  valor  de  cada  posici�n  y  la  suma  de  todos  los valores. Haz un m�todo para rellenar 
el Array (que tenga como par�metros los n�meros entre los que tengaque generar), para mostrar el contenido 
y la suma del Array y un m�todo privado para generar n�mero aleatorio (lo puedes usar para otros ejercicios).*/

package Ejercicios;

import java.util.Scanner;

public class Ej_2_30_01 {

	public static void main(String[] args) {
		
		
		int tamanio = 0;
		int [] arreglo2= new int[tamanio];
		Scanner ingresar = new Scanner(System.in);
		System.out.println("Ingrese el tama�o del arreglo: ");
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
