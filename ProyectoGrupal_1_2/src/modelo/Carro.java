package modelo;


/**
 *Clase Padre que definir� los distintos veh�culos que
 *se crear�n dentro de la flota de defensa.
 *@author Gerald Reyes, Patricio Acu�a y Edgardo Mora
 * 
 */
public class Carro {
	
	private  int cantidadDeOcupantes;
	private String fechaDeIngreso;
	private int ubiFila;
	private int ubiColumna;
	
	public Carro() {
		super();
	}

	public Carro(int cantidadDeOcupantes, String fechaDeIngreso, int ubiFila, int ubiColumna) {
		super();
		this.cantidadDeOcupantes = cantidadDeOcupantes;
		this.fechaDeIngreso = fechaDeIngreso;
		this.ubiFila = ubiFila;
		this.ubiColumna = ubiColumna;
	}

	public int getCantidadDeOcupantes() {
		return cantidadDeOcupantes;
	}

	public void setCantidadDeOcupantes(int cantidadDeOcupantes) {
		this.cantidadDeOcupantes = cantidadDeOcupantes;
	}

	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public int getUbiFila() {
		return ubiFila;
	}

	public void setUbiFila(int ubiFila) {
		this.ubiFila = ubiFila;
	}

	public int getUbiColumna() {
		return ubiColumna;
	}

	public void setUbiColumna(int ubiColumna) {
		this.ubiColumna = ubiColumna;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Carro [cantidadDeOcupantes=" + cantidadDeOcupantes + ", fechaDeIngreso=" + fechaDeIngreso + ", ubiFila="
				+ ubiFila + ", ubiColumna=" + ubiColumna + "]";
	}

	public void mostrarDatos() {
		
		
		
		
	}
	

}
