package electrodomesticos;



/**
 * @author Edgardo Mora
 *
 */
public class Electrodomestico {
	
	double precio_base=100000;
	String color="BLANCO";
	char consumo_energetico='F';
	double peso=5.0;
	
	/**
	 * Constructor por defecto
	 */
	public Electrodomestico() {
		
	}

	/**
	 * Constructor que pasa los parametros:
	 * @param precio_base
	 * @param peso
	 * el resto de los atributos por defecto.
	 */
	public Electrodomestico(double precio_base, double peso) {
		
		this.precio_base = precio_base;
		this.peso = peso;
	}

	/**
	 * Constructor que pasa todos los atributos como parametros:
	 * @param precio_base
	 * @param color
	 * @param consumo_energetico
	 * @param peso
	 */
	public Electrodomestico(double precio_base, String color, char consumo_energetico, double peso) {
		
		this.precio_base = precio_base;
		this.color = comprobarColor(color);
		this.consumo_energetico = comprobarConsumoEnergetico(consumo_energetico);
		this.peso = peso;
	}

	/**
	 * @return el precio_base
	 */
	public double getPrecio_base() {
		return precio_base;
	}

	/**
	 * @return el color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return el consumo_energetico
	 */
	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	/**
	 * @return el peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * @param precio_base the precio_base to set
	 */
	public void setPrecio_base(double precio_base) {
		this.precio_base = precio_base;
	}



	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	/**
	 * Método que comprueba si la letra ingresada como parametro:
	 * @param consumo_energetico
	 * es correcta, si no lo es, asigna la letra definida por defecto 'F'.
	 */
	public char comprobarConsumoEnergetico (char consumo_energetico) {
		
		consumo_energetico=Character.toUpperCase(consumo_energetico);
		
		if(consumo_energetico=='A') {
			consumo_energetico='A';
		}else {
			if(consumo_energetico=='B') {
				consumo_energetico='B';
			}else {
				if(consumo_energetico=='C') {
					consumo_energetico='C';
				}else {
					if(consumo_energetico=='D') {
						consumo_energetico='D';
					}else {
						if(consumo_energetico=='E') {
							consumo_energetico='E';
						}else {
							if(consumo_energetico=='F') {
								consumo_energetico='F';
							}else {
								consumo_energetico='F';
							}	
							
						}
					}
				}
			}
		}
		return consumo_energetico;
	}
	
	/**
	 * Método que comprueba que el color pasado es correcto, si no lo es,
	 * otorga el color por defecto 'BLANCO'.
	 * @param color
	 * @return
	 */
	public String comprobarColor (String color) {
		
		if(color.equalsIgnoreCase("Blanco") || color.equalsIgnoreCase("Negro") ||
				color.equalsIgnoreCase("Rojo") || color.equalsIgnoreCase("Azul") ||
				color.equalsIgnoreCase("Gris")) {
			color=color.toUpperCase();
		}else {
		color="BLANCO";
	    }
		
		return color;
	}
	
	/**
	 * Método que aumenta el precio final, según consumo energético y tamaño.
	 * @return
	 */
	public double precioFinal() {
		
		double precioFinal=this.precio_base;
		
		if (peso > 0 && peso <=19) {
			precioFinal=precioFinal+10;
		}
		if (peso > 19 && peso <= 49) {
			precioFinal=precioFinal+50;
		}
		if (peso > 49 && peso <=79) {
			precioFinal=precioFinal+80;
		}
		if (peso >= 80) {
			precioFinal=precioFinal+100;
		}
		
		
		if (consumo_energetico == 'A') {
			precioFinal=precioFinal+100;
		}
		if (consumo_energetico == 'B') {
			precioFinal=precioFinal+80;
		}
		if (consumo_energetico == 'C') {
			precioFinal=precioFinal+60;
		}
		if (consumo_energetico == 'D') {
			precioFinal=precioFinal+50;
		}
		if (consumo_energetico == 'E') {
			precioFinal=precioFinal+30;
		}
		if (consumo_energetico == 'F') {
			precioFinal=precioFinal+10;
		}
		
		return precioFinal;
		
		
	}

	@Override
	public String toString() {
		return "Electrodomestico [precio_base=" + precio_base + ", color=" + color + ", consumo_energetico="
				+ consumo_energetico + ", peso=" + peso + "]";
	}
	
	
	
	
	
	

	
	
	
	
	

}
