package clase2;

public class Persona {
	
	
	public String nombre; //null
	public int dni; //0
	public float sueldo;//0.000
	public boolean alumno;//false
	protected int protegido;
	public Persona() {
	}
	public Persona(String nombre, int dni, float sueldo, boolean alumno) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sueldo = sueldo;
		this.alumno = alumno;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public float getSueldo() {
		return sueldo;
	}
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	public boolean isAlumno() {
		return alumno;
	}
	public void setAlumno(boolean alumno) {
		this.alumno = alumno;
	}
	
	@Override
	public String toString() {
		return "Nombre :" + this.nombre + " "+ "DNI :" + this.dni + " "+ "Sueldo :" +  this.sueldo + " "+ "es Alumno :" + this.alumno;
	}
	@Override //a modo de confirmacion no es necesario
	public boolean equals(Object o) {
		if(o != null) 
		{
			if(o.getClass().equals(this.getClass())) {
				
				Persona auxP  = (Persona)o;
				if(this.dni == auxP.dni && this.nombre.equals(auxP.nombre)) // no deberia usar == 
				{
					return true;
				}
			}
		}
		return false;
	}
	
	@Override
	public  int hashCode() // debemos lograr q dos objetos con el metodo equals dan true
	//el hashcode nos tiene q dar el mismo entero.
	{
		final int primo =  31;
		int resultado  = primo*this.dni;
		resultado += primo*this.nombre.hashCode();
		return primo*resultado;
	}
	//To string hashcode y Tostring son los 3 metodo a sobreescribir 
	//cuando una clase tiene 
	//los seters y geters,
	//los contructores (por defecto y con todos los parametros) 
	//y estas tres clases sobreeescrita
	//todos los atributos privados
	//se la denomina POJO objeto plano en java
	
	
}