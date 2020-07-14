import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//tengo q hacer esto para q este en tiempo de ejecucion 
@Retention(RetentionPolicy.RUNTIME)
//con el target digo a que tipo de cosas le puedo poner esta etiqueta
//si no pongo esto tiene por defecto a todos
//@Target({ElementType.METHOD,
	//ElementType.FIELD})
public @interface Prueba{
	public int cantidad();
	public String nombreTest() default "Sin nombre";
	

}
