
public class miHilo implements Runnable{
	
	//todo lo que pase en run va a pasar en paralelo 
	//se llega al run cuando ejecuto el start
	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			
			e.printStackTrace();
			return;
		}
		System.out.println("ejecuacion" + Thread.currentThread().getName());
		
		//esto mas que nada si es un hilo con n while, sleep o return
		//pero siempre al final para q haga todo lo q dice el hilo
		if(Thread.interrupted()){
			return;
		}
	}
}
