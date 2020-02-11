package Ejercicios;
import java.util.*;

public class Ej_1_30_01 {

	public static void main(String[] args) {
		
		ArrayList<Integer> array1 = new ArrayList();
		Scanner ingresar = new Scanner(System.in);
		
		for (int i=0; i<14;i++) {
			System.out.println("Ingrese un numero: ");
		    array1.add(i,ingresar.nextInt() );
		    
		}
		int dato=0;
		for (int j=0; j<14; j++)
		{
			dato=array1.get(j); 
			System.out.println(" valor--- ["+j+"]: "+dato);
			
		}

	}

}
