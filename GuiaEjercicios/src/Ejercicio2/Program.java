package Ejercicio2;

import Ejercicio1.Auto;
import Ejercicio1.EMarca;

public class Program {
	public static void main(String[] args) {
		Coche c = crearCoche();
		//c.parar();
		System.out.println(c.toString());
		//c.arrancar();
		c.cerrarPuertaNumero(0);
		c.cerrarPuertaNumero(1);
		c.inflarRuedaNumero(0);
		c.inflarRuedaNumero(1);
		c.inflarRuedaNumero(2);
		c.inflarRuedaNumero(3);
		c.arrancar();
		System.out.println(c.toString());
		c.parar();
		System.out.println(c.toString());
	}
	
	static public Coche crearCoche() {
		Motor m = new Motor();
		Rueda r1 = new Rueda();
		Rueda r2 = new Rueda();
		Rueda r3 = new Rueda();
		Rueda r4 = new Rueda();
		Rueda[] ruedas = {r1,r2,r3,r4};
		Puerta p1 = new Puerta();
		Puerta p2 = new Puerta();
		p2.setVent(true);
		p1.setVent(true);
		Puerta[] puertas = {p1,p2};
		Coche c = new Coche(m,ruedas,puertas);
		return c;
	}

}
