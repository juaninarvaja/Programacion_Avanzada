package Ejercicio5.program;

public class Program {
	public static void main(String[] args) {
		Calculadora cal = new Calculadora();
		int a = 10;
		int b = 3;
		Double ejemplo = cal.sumar(a, b);
		System.out.println("suma " + ejemplo);
		ejemplo = cal.restar(a, b);
		System.out.println("resta " + ejemplo);
		ejemplo = cal.multiplicar(a,b);
		System.out.println("multiplicacion " + ejemplo);
		try {
			ejemplo =cal.dividir(a,b);
			System.out.println("division " + ejemplo);
		} catch (ExceptionDivisonPorCero e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			//e.getMessage();
			//System.out.println(e.getCause());
			System.out.println(e.getMessage());
			
		}
		
		
	}

}
