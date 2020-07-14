package Ejercicio2;

import java.util.Arrays;

//Coche: con un motor, cuatro ruedas y dos puertas;
//con los métodos: Arrancar (chequea que las puertas estén cerradas, que las ruedas
//estén infladas y arranca el motor. Si falla algo, se deberá informar lo ocurrido por
//consola), Parar (chequea que el coche este andando, apaga el motor, abre las
//puertas y cierra las ventanas. Si falla algo, se deberá informar lo ocurrido por
//consola) y control (debe informar el estado de las ruedas).
public class Coche {
	private Motor motor;
	private Rueda ruedas[];
	private Puerta puertas[];
	
	public Coche() {
		super();
	}
	
	public Coche(Motor m, Rueda[] ruedas, Puerta[] puertas) {
		super();
		this.motor = m;
		this.ruedas = ruedas;
		this.puertas = puertas;
	}
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Rueda[] getRuedas() {
		return ruedas;
	}

	public void setRuedas(Rueda[] ruedas) {
		this.ruedas = ruedas;
	}

	public Puerta[] getPuertas() {
		return puertas;
	}

	public void setPuertas(Puerta[] puertas) {
		this.puertas = puertas;
	}



	public boolean arrancar() {
		boolean errorDetectado = false;
		
		if(this.motor.isEncendido() == false) {
			for(int i=0; i<this.ruedas.length;i++) {
				if(this.ruedas[i].isRuedaInflada() == false) {
					System.out.println("Error! No se puede arrancar por "
							+ "rueda desinflada, chequee la rueda " + i);
					errorDetectado = true;
				}
			}
			for(int j=0; j<this.puertas.length;j++) {
				if(this.puertas[j].isPuertaCerrada() == false) {
					System.out.println("Error! No se puede arrancar por "
							+ "puerta abierta, chequee la puerta " + j );
					errorDetectado = true;
				}
			}
		}
			
			if(errorDetectado) {
				this.motor.setEncendido(false);
				return false;
				
			}
			else {
				this.motor.setEncendido(true);
				return true;
			} 
	}
	
	public boolean cerrarPuertaNumero(int n) {
		if(this.puertas != null) {
			Puerta[] arrayAux = this.puertas;
			arrayAux[n].setPuertaCerrada(true);
			this.puertas = arrayAux;
			return true;
		}
		return false;
	}
	public boolean abrirPuertaNumero(int n) {
		if(this.puertas != null) {
			Puerta[] arrayAux = this.puertas;
			arrayAux[n].setPuertaCerrada(false);
			this.puertas = arrayAux;
			return true;
		}
		return false;
	}
	public boolean inflarRuedaNumero(int n) {
		if(this.ruedas != null) {
			Rueda[] arrayAux = this.ruedas;
			arrayAux[n].setRuedaInflada(true);
			return true;
		}
		return false;
	}
	
	public boolean parar(){
		
		if(this.motor != null && this.motor.isEncendido() == true) {
			this.abrirPuertaNumero(0);
			this.abrirPuertaNumero(1);
			this.puertas[0].setVent(false);
			this.puertas[1].setVent(false);
			this.motor.setEncendido(false);
			return true;
		}
		else 
		{
			System.out.println("El coche esta apagado");
			return false;
		}
		
	}
	

	@Override
	public String toString() {
		return "Coche [motor=" + motor + ", ruedas=" + Arrays.toString(ruedas) + ", puertas=" + Arrays.toString(puertas)
				+  "]";
	}
	
}
