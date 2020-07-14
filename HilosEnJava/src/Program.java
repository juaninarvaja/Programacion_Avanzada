import java.sql.Time;

public class Program {
	public static void main (String[] args) {
	/*
	//el main es el hilo principal 
	//tengo q lanzar un hilo para que corra en paralelo main y otro
	//no es ecesario un procesador por hilo(!
	
		Runnable r = new miHilo();
		Thread t = new Thread(r," hilo uno ");
		Thread t2 = new Thread(r," hilo dos ");
		//tiene un ciclo de vida, que de inicia llamando a start
		System.out.println(t.isAlive());
		//LE PUEDO SETEAR PRIORIDADES PARA QUE SEA MAS IMPORTANTE
		//el valor por defecto es 5 y mas grande mas importante!
		//no garantiza que se cumpla antes
		t.setPriority(10);
		t.start();
		System.out.println(t.isAlive());
		//System.out.println(Thread.currentThread().getName());  //aca me devuelve main
		//cuando termina el metodo run se muere el hilo
		//el hilo s epuede ejecutar una unica vez
		//de muerto a start no se puede vover
		System.out.println(t.isAlive());
		t2.start();
		System.out.println(t.isAlive());
		
		 //la JVM junto con el Sist Op se balancean para ver cunado le toca ejecutar a cda hilo. 
		 
		while(t.isAlive() == true && t2.isAlive() == true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Terminaron los dos hilos!");
		*/
		
		//METODO JOIN
		Thread hiloPersona1 = new Thread(new MiHiloPersona("Juan"),"hiloPersona1");
		Thread hiloPersona2 = new Thread(new MiHiloPersona("Marcos"),"hiloPersona2");
		Thread hiloPersona3 = new Thread(new MiHiloPersona("Mabel"),"hiloPersona3");
		
		//con el join creo una cola de trabajo
		//el siguiente se ejecura cuando el anterior termine o se cumpla la clausla del join
		//el join puede recibir una cantidad de milisegundos para q termine el hilo
		hiloPersona1.start();
		//hiloPersona1.join();
		hiloPersona2.start();
		//hiloPersona2.join();
		hiloPersona3.start();
		//hiloPersona3.join();
		
		//el metodo YIELD
		//VA DENTRO DEL METODO RUN
		//meto al hilo que se esta ejecutando de nuevoo en la cola , ya que si no no es posible que sean parejos 
		//los balanceos de cada hilo
		//permite que se hagan de manera sicnronizado 
		
		//no va a funcionar si esta el join claramente por eso esta comentados
	
}
}
