import java.math.BigInteger;

@Prueba(cantidad = 3, nombreTest= "es una clase")
public class Persona {
	private String nombre;
	private String apellido;
	private Integer dni;
	private Long id;
	
	public Persona() {
		
	}
	
	public Persona(String nombre, String apellido, Integer dni, Long id) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + ", dni=" + this.dni + ", telefono=" + this.id + "]";
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Prueba(cantidad= 2, nombreTest= "getApellido")
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getDni() {
		return this.dni;
	}
	public void setDni(Integer dni) {
		this.dni = dni;
	}
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
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
		Persona other = (Persona) obj;
		if (dni != other.dni)
			return false;
		return true;
	}

	
	
	
	
}
