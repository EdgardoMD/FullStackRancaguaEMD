package electrodomesticos;



public class Principal {

	public static void main(String[] args) {
		
        Electrodomestico  Electrodomesticos [] = new Electrodomestico [10];
    	
    	Electrodomesticos [0] = new Electrodomestico ();
    	Electrodomesticos [1] = new Electrodomestico(150000, "gris", 'C', 25);
    	Electrodomesticos [2] = new Electrodomestico(400000, "Violeta", 'A', 82.5);
    	Electrodomesticos [3] = new Lavadora ();
    	Electrodomesticos [4] = new Lavadora (200000.0, 25);
    	Electrodomesticos [5] = new Lavadora (150000.0, "Azul", 'E', 35.5, 32);
    	Electrodomesticos [6] = new Television ();
    	Electrodomesticos [7] = new Television (180000, 2.5);
    	Electrodomesticos [8] = new Television (32, false);
    	Electrodomesticos [9] = new Television (55, true);
    	
    	double suma1=0;
		double suma2=0;
		double suma3=0;
		System.out.println("\n------------------------------------------------------");
		System.out.println("SE RECORRE EL ARRAY EJECUTANDO EL método precioFinal().");
		System.out.println("------------------------------------------------------\n");
		
    	for(int i=0; i<Electrodomesticos.length; i++) {
    		
    		System.out.println("El precio final a pagar "+ " por el producto N° "+ (i+1)+ " es : "+ Electrodomesticos[i].precioFinal());
    	}
    	
    	System.out.println("\n------------------------------------------------------");
		System.out.println("MUESTRA LA SUMA DEL PRECIO FINAL DE CADA CLASE POR SEPARADO:");
		System.out.println("------------------------------------------------------\n");
		
    	for(int i=0; i<Electrodomesticos.length; i++) {
    		
    		if(Electrodomesticos[i] instanceof Electrodomestico) {
    			//System.out.println("El "+ i + "Electrodomestico" + " cuesta: " + Electrodomesticos[i].precioFinal());
    			suma1= suma1 + Electrodomesticos[i].precioFinal();
    		}
    		if(Electrodomesticos[i] instanceof Lavadora) {
    			suma2=suma2+Electrodomesticos[i].precioFinal();
    		}
    		if(Electrodomesticos[i] instanceof Television){
    			suma3=suma3+Electrodomesticos[i].precioFinal();
    		}
    	}
    		
    		System.out.println("La suma del precio final de los objetos que pertenecen a La clase Electrodomestico es: " + suma1);
        	System.out.println("La suma del precio final de los objetos que pertenecen a La clase Lavadora es: " + suma2);
        	System.out.println("La suma del precio final de los objetos que pertenecen a La clase Television es: " + suma3);
	}
}
    
		
		

		
		
		
		

		




