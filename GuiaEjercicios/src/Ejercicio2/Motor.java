package Ejercicio2;

public class Motor {
	private boolean encendido;

	public Motor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Motor(boolean encendido) {
		super();
		this.encendido = encendido;
	}
	
	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	@Override
	public String toString() {
		return "Motor [encendido=" + encendido + "]";
	}

}
