import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {
	//cuando tabajamos a traves de la refelxion infromatica 
	//todo lo q escribimos en lasclases no existe mas
	//trabajamos con lo que esta en memoria RAM
	//permite hacer cosas genericas 
	//EL TEMA de programacion avanzada junto a hilos
	
	/*
	 Permite ver una clase y opcionalmente modifiar su estructura
	 la clase (por ej) "Persona" existe en tiempo de compliacion
	 luego existe en la RAM
	 puedo por ej poner un atributo privado en publico
	 puedo convertir un string en una clase o en funciones e invocarlas
	 a traves de un string uedo crear una clase o funcion e invocarla o ejecutarlos
	 puedo escribir un string y tomarlo como si fuese codigo escrito por el programador
	 */
	
	
	//uso la api Java de Relfexion 
	//usamos dos clases muy importantes   : Field y Method ("Class")
	
	public static void main(String[] args) {
	/*
	
		
		Class c =  Persona.class;
		Persona p = new Persona("Juan","Narvaja",40236460,(long) 9);
		Class z = p.getClass();
		Class clazz = null;
		//System.out.println("hola");
		
		try {
			clazz = Class.forName("Persona"); //levanto los driver y pongo en RAM la clase clazz
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		//getDeclaredFields todos los atributos dentro de la clase
		//con getFields obtengo todo los atributos q se pueden ver desde fuera de la clase
		for(Field f : c.getDeclaredFields()) {
			
			//System.out.println(f.getName()); //el nombre
			//System.out.println(f.getType()); //el tipo
			//System.out.println(f.isAccessible()); //si se puede acceder desde donde stoy ejecutando
			//System.out.println(f.getModifiers()); //el modificador (?
		}
		for(Method m :clazz.getDeclaredMethods() ){
			
			//System.out.println(m.getName());
			//si no recibe parametros
			//if(m.getParameterCount() == 0) {
				//System.out.println("entro a los q tienen un solo param");
				//el primer paraemtro es boligatorio y tiene q ser una instancia deesa clase
				//el segundo argunemtno son los argumentos
				//try {
					//Object o = m.invoke(p, new Object[0]);
					//System.out.println("retorno" + o);
				//} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					//e.printStackTrace();
				//}
			//}
			//else {
				if(m.getName().startsWith("set")) {
					System.out.println(m.getName());
					Object[] paramet = new Object[1];
					if(m.getParameterTypes()[0].getSimpleName().equals("String")) {
						if(m.getName().contains("Nombre")) {
							System.out.println("entro a setear nombre");
							paramet[0] = "Juan Roman";
						}
						else if(m.getName().contains("Apellido")) {
							System.out.println("entro a setear apellido");
							paramet[0] = "Riquelme";
						}
					}
					else if(m.getParameterTypes()[0].getSimpleName().equals("Integer")) {
						paramet[0] = 40236460;
					}
					else if(m.getParameterTypes()[0].getSimpleName().equals("Long")){
						paramet[0] = (long) 17;
					}
				try {
					Object o = m.invoke(p, paramet);
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}				}

			}
		
		for (Method m :clazz.getDeclaredMethods() ){
			if(m.getParameterCount() == 0) {
				if(m.getName().startsWith("get")) {
					try {
					Object o = m.invoke(p, new Object[0]);
					System.out.println("retorno" + o);
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					 //TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		}
 
		
		//q pasa asi querenos crear nuestro objeto q nosea hardcodeado
		//con el gtConstructor
		Object pAux = null; 
		for(Constructor con : clazz.getConstructors()) {
			if(con.getParameterCount() == 0) {
				try {
					pAux = con.newInstance();
				} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
						| InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		for(Field f : clazz.getDeclaredFields()) {
			//como son privados no me deja hacer get y set directamente en el field (campo) 
			//por lo tanto puedo hacerlos accesibles desde fuera con el setAccesible
			f.setAccessible(true);
			System.out.println(f.getName());
			//como estoy en memoria puedo hacer lo q quiera dentro del mismo programa (como estoy ahora)
			//desde afuera no pudo hacerlo porque la JVM no me va a dejar
			try {
				System.out.println(f.get(pAux));
				//System.out.println(f.set(pAux,"kad"));
			} catch (IllegalArgumentException | IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		__________________________________________________________________________________________
		/////////////////////////////////////////////////////////// clase 2 ///////////////////////////////////
		/////////////////////////////////////////////////////////////////////////////////////////////////////////
		______________________________________________________________________________________________
		*/
		
		//un anottation es para agregar informacion a metodos, atributos, clases parametros, etc
		//sirve para agregar informacion extra
		/*
		 ej @Override , @Test ,@Ignore
		 
		 
		 */
		Class clazz = Persona.class;
		Method[] metodos = clazz.getDeclaredMethods();
		try {
			Object obj = clazz.getConstructors()[0].newInstance();
			
			for(Method m : metodos) {
				//Override o = m.getAnnotation(Override.class);
				//Ignore i = m.getAnnotation(Ignore.class);
				Prueba p = m.getAnnotation(Prueba.class);
				if(p != null) {
					for(int i = 0; i<p.cantidad(); i++) {
						System.out.println("Se ejecuto el metodo " + p.nombreTest());
					}
					System.out.println(p);
				}
				//si quiero saber si la clase tiene
				//si le pongo testeabe  ala clase 
				
				//solo porque los metodos de su clase de testinf no reciben parametros a mi no me funca
				//m.invoke(obj, new  Object[0]); //ejecuto todos los metodos de persona 
			}
			if(clazz.getAnnotation(Prueba.class) != null) {
				System.out.println("la clase calzz es prueba");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	}
}
