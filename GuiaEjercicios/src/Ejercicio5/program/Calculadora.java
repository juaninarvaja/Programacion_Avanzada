package Ejercicio5.program;

public class Calculadora implements ICalcular {

	@Override
	public Double sumar (Number a, Number b) {
		if(a != null && b!=null)
		{
			Number c = a.doubleValue() + b.doubleValue();
			return (Double) c;
		}
			return null;
	}

	@Override
	public Double dividir(Number a, Number b) throws ExceptionDivisonPorCero {
		
		if(a != null && b!=null)
		{
			if(b.doubleValue() == 0) {
				throw new ExceptionDivisonPorCero();
				
			}else {
				Number c = a.doubleValue() / b.doubleValue();
				return (Double) c;
			}
			
		}
		 return null;
	}

	@Override
	public Double restar(Number a, Number b) {
		if(a != null && b!=null)
		{
			Number c = a.doubleValue() - b.doubleValue();
			return (Double) c;
		}
			return null;
	}

	@Override
	public Double multiplicar(Number a, Number b) {
		if(a != null && b!=null)
		{
			Number c = a.doubleValue() * b.doubleValue();
			return (Double) c;
		}
			return null;
	}


	
}
