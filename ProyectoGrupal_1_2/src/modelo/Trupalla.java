package modelo;

/**
 *Clase hija que hereda de Carro, que incorpora adem�s dos atributos propios.
 * @author Gerald Reyes, Patricio Acu�a y Edgardo Mora
 */

public class Trupalla extends Carro{
	
	private int nivelArmadura;
	private String conductor;
	
	public Trupalla() {
		super();
	}

	public Trupalla(int cantidadDeOcupantes, String fechaDeIngreso, int ubiFila, int ubiColumna, int nivelArmadura,
			String conductor) {
		super(cantidadDeOcupantes, fechaDeIngreso, ubiFila, ubiColumna);
		this.nivelArmadura = nivelArmadura;
		this.conductor = conductor;
	}

	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public String getConductor() {
		return conductor;
	}

	public void setConductor(String conductor) {
		this.conductor = conductor;
	}

	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", conductor=" + conductor + "]";
	}
	
	

}
