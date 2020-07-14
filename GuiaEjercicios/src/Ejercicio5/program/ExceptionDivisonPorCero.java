package Ejercicio5.program;

public class ExceptionDivisonPorCero extends Exception {
	
   /* public String ExcepcionDivisonPorCero(String msg) {
        
    }*/
	@Override
	public String getMessage(){
		return "No se puede dividir por cero";
	}
}
