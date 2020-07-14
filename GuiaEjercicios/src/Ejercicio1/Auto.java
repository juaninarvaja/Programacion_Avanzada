package Ejercicio1;


public class Auto {
	private String patente;
	private EMarca marca;
	private String modelo;
	private float precio;
	public Auto() {
	}
	public Auto(String patente, EMarca marca, String modelo, float precio) {
		super();
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public EMarca getMarca() {
		return marca;
	}
	public void setMarca(EMarca marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
	
	
	
}
