package Ejercicio2;

public class Puerta {
	private boolean puertaCerrada;
	private Ventana vent;
	public boolean isPuertaCerrada() {
		return puertaCerrada;
	}
	public void setPuertaCerrada(boolean puertaCerrada) {
		this.puertaCerrada = puertaCerrada;
	}
	public boolean getVent() {
		return this.vent.isVentanaAbierta();
	}
	public void setVent(boolean valor) {
		this.vent.setVentanaAbierta(valor);
	}
	public Puerta() {
		super();
		Ventana v = new Ventana();
		this.vent = v;
		
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Puerta [puertaCerrada=" + puertaCerrada + " " + vent + "]";
	}
	
}
