package Ejercicio2;

public class Ventana {
	private boolean ventanaAbierta;

	public boolean isVentanaAbierta() {
		return ventanaAbierta;
	}

	public void setVentanaAbierta(boolean ventanaAbierta) {
		this.ventanaAbierta = ventanaAbierta;
	}

	public Ventana() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "VentanaEstaAbierta =" + ventanaAbierta;
	}
	
	
}
