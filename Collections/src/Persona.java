
public class Persona implements Comparable {
	private String nombre;
	private String apellido;
	
	public Persona(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return this.apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.apellido == null) ? 0 : this.apellido.hashCode());
		result = prime * result + ((this.nombre == null) ? 0 : this.nombre.hashCode());
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
		if (this.apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (this.nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!this.nombre.equals(other.nombre))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		Persona p = (Persona) o;
		int i =  this.nombre.compareTo(p.nombre);
		//si el nombre es el mismo compara por apellido
		//si da 0 es pq es igual
		if(i==0) {
			return this.apellido.compareTo(p.apellido);
		}
		else return i;
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + this.nombre + ", apellido=" + this.apellido + "]";
	}
	
	
}
