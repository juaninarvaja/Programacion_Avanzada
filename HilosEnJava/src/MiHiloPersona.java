
public class MiHiloPersona implements Runnable{
	
	private String nombre;
	public MiHiloPersona(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<6;i++) {
			//Thread.sleep(1000);
			System.out.println(nombre + " " + i);
			//el metodo YIELD
			//VA DENTRO DEL METODO RUN
			//meto al hilo que se esta ejecutando de nuevoo en la cola , ya que si no no es posible que sean parejos 
			//los balanceos de cada hilo
			//permite que se hagan de manera sicnronizado 
			//siempre y cuando tengan la misma prioridad
			
			Thread.yield();
		}
		
	}

}
