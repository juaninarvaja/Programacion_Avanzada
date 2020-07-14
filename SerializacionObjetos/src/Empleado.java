import java.io.Serializable;
import java.math.BigDecimal;

public class Empleado implements Serializable {
	private String nombre;
	private String apellido;
	private BigDecimal salario;
	
	public Empleado() {
		
	}
	public Empleado(String nombre, String apellido, BigDecimal salario) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.salario = salario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public BigDecimal getSalario() {
		return salario;
	}
	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	 
	
}
