package electrodomesticos;

public class Television extends Electrodomestico{
	
	int resolucion=20;
	boolean sintonizador_tdt=false;
	/**
	 * Constructor por defecto.
	 */
	public Television() {
		super();
		
	}
	/**
	 * Constructor con:
	 * @param precio_base
	 * @param peso
	 * El resto de los atributos por defecto.
	 */
	public Television(double precio_base, double peso) {
		super(precio_base, peso);
		
		
	}
	/**
	 * Constructor con atributos propios de la clase:
	 * @param resolucion
	 * @param sintonizador_tdt
	 * Los demas atributos heredados.
	 */
	public Television(int resolucion, boolean sintonizador_tdt) {
		super();
		this.resolucion=resolucion;
		this.sintonizador_tdt=sintonizador_tdt;
		
	}
	/**
	 * @return the resolucion
	 */
	public int getResolucion() {
		return resolucion;
	}
	/**
	 * @param resolucion the resolucion to set
	 */
	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}
	/**
	 * @return the sintonizador_tdt
	 */
	public boolean isSintonizador_tdt() {
		return sintonizador_tdt;
	}
	/**
	 * @param sintonizador_tdt the sintonizador_tdt to set
	 */
	public void setSintonizador_tdt(boolean sintonizador_tdt) {
		this.sintonizador_tdt = sintonizador_tdt;
	}
	@Override
	//Método que recalcula el precio final en base a la resolución y al sintonizador.
	public double precioFinal() {
		double precioFinalTv=super.precioFinal();
		if (resolucion>40) {
			precioFinalTv=precioFinalTv+(precioFinalTv*(30/100));	
		}
		
		if(sintonizador_tdt==true) {
			precioFinalTv=precioFinalTv+50;
		}
		return precioFinalTv;
		
	}
	@Override
	public String toString() {
		return "Television [resolucion=" + resolucion + ", sintonizador_tdt=" + sintonizador_tdt + ", precio_base="
				+ precio_base + ", color=" + color + ", consumo_energetico=" + consumo_energetico + ", peso=" + peso
				+ "]";
	}
	
	
	
	
	
	
	

}
