package electrodomesticos;

public class Lavadora extends Electrodomestico {
	
	double carga;

	/**
	 * Constructor por defecto.
	 */
	public Lavadora() {
		super();
		
	}

	/**
	 * Constructor que ingresa:
	 * @param precio_base
	 * @param peso
	 * El resto de los atributos por defecto.
	 */
	public Lavadora(double precio_base, double peso) {
		super(precio_base, peso);
		
	}

	/**
	 * Constructor que ingresa los parametros:
	 * @param precio_base
	 * @param color
	 * @param consumo_energetico
	 * @param peso
	 * mas el parametro propio:
	 * @param carga
	 * 
	 */
	public Lavadora(double precio_base, String color, char consumo_energetico, double peso, double carga) {
		super();
		this.precio_base=precio_base;
		this.color=super.comprobarColor(color);
		this.consumo_energetico=super.comprobarConsumoEnergetico(consumo_energetico);
		this.peso=peso;
		this.carga=carga;
	}

	/**
	 * @return the carga
	 */
	public double getCarga() {
		return carga;
	}

	/**
	 * @param carga the carga to set
	 */
	public void setCarga(double carga) {
		this.carga = carga;
	}
	
    @Override
    //Método que recalcula el precio final, en base a la carga.
    public double precioFinal() {
		
		double precioFinalLav=super.precioFinal();
		
		if(carga >= 30) {
			precioFinalLav = precioFinalLav+50;
		}
		return precioFinalLav;
		
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precio_base=" + precio_base + ", color=" + color
				+ ", consumo_energetico=" + consumo_energetico + ", peso=" + peso + "]";
	}
	
	
	
	
	
	
	
	
	

}
