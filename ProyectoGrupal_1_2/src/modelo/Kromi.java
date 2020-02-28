package modelo;


/**
 *Clase hija que hereda de Carro y agrega sus propios atributos.
 * @author Gerald Reyes, Patricio Acuña y Edgardo Mora
 */

public class Kromi extends Carro{
    
 
	
	private int anoDeFabricacion;
	private String marca;
	
	public Kromi() {
		super();
	}

	public Kromi(int cantidadDeOcupantes, String fechaDeIngreso, int ubiFila, int ubiColumna, int anoDeFabricacion,
			String marca) {
		super(cantidadDeOcupantes, fechaDeIngreso, ubiFila, ubiColumna);
		this.anoDeFabricacion = anoDeFabricacion;
		this.marca = marca;
	}

	public int getAnoDeFabricacion() {
		return anoDeFabricacion;
	}

	public void setAnoDeFabricacion(int anoDeFabricacion) {
		this.anoDeFabricacion = anoDeFabricacion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Kromi [aï¿½oDeFabricacion=" + anoDeFabricacion + ", marca=" + marca + "]";
	}
	
	
	
	

}
