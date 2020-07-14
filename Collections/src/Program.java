import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Program {
	
	public static void main (String[] args) {
	
		
		String[] array = new String[2];
		int i = array.length; // 2 
		//El list es lo mas parecido a los array[]
		//la principal diferencia es q un array tiene q saber cuantos elementos va a almacenar.
		//guarda elementos de manera secuencial 
		//EL ARRAY HEREDA DE COLLECCION 
		//no puedo hacer list de tipos primirtivos de int, char, etc
		//recibe objetos Integer,etc.
		//lo mismo aplica para Vector y LinkedList al igual q ArrayList.
		
		List<String>lista = new ArrayList<>();
		lista.size(); //0
		lista.add("Hola"); //indice 0
		lista.add("Chau"); //indice 1
		
		/* 
		  las diferencias entre arraylist y el resto.
		arraylist es el tipico funcionamiento de las colecciones, cada vez q se hace un add
		 se guarda un elemento en la siguiente posicion (aplica para posiciones de memoria).
		 aca se agregan rapido y se pueden recorrer rapido. por eos por lo general usamos siempre
			
		 */
		
		lista.add("Chaau2"); //2
		lista.remove(1); // borro el "chau"
		//System.out.println(lista.get(1)); // ahora me  devuelve "Chaau2". 
		
		/* 
		 cuando borramos un elemento reacomoda (Reindexa) para que quede acomodado.
		 por lo tanto si empiezo a remover elementos o reordenar no conviene usar ArrayList.
		 en caso de agregar una sola vez y despues vamos a modficar el orden dentro de ella la mejor opcion es
		 LinkedList<>();
		 
		  */
		/*
		 LINKED LIST
		 es mucho mas pesado a la hora de agregar y recorrer pq esta doblemente enlazada
		 al hacer .add calcula  quien esta arriba y quien abajo
		 y el indice se calcula cuando se va a operar sobre el objeto
		 entonces si lo voy a estar reordenando y elmininando objetos conviene este
		 */
		List<String> listaLinked = new LinkedList<>();
		listaLinked.add("hola1");
		listaLinked.add("hola2");
		listaLinked.remove("hola1"); //es menos costoso esto q pasar el indice
		
		/* VECTOR
		 es como el arrayList pero con Hilos
		 si tenemos una lista compartida entre dos hilos tiene que ser Vector pq soporta multi-procesamiento
		 es mas costoso de usar
		 */
		List<String> listaVector = new Vector<>();
		
		
		
		/*
		 SET //conjunto en ingles
		 hereda de collection (a igual q List, por eso comparten metodos);
		 por lo general para usar un set usamos un HashSet (Es como el arraylist de list) 
		 Es un conjunto de elementos pero no de manera secuencial
		 el HASHSET ordena a partir del hash 
		 */
		Set<String> setString = new HashSet<>(); // esta implementacion ordena a partir del hash de cada objeto
		setString.add("hola1");
		setString.add("chau1");
		setString.add("hola2");
		setString.add("chau2");
		setString.add("hola3");
		setString.add("chau3");
		setString.add("chau3");
		//no tengo el metodo get pq no tiene indice
		//si o si se recorre con un foreach
		//EL SET NO CONTIENE ELEMENTOS DUPLICADOS 
		//NO PUEDE TENER DOS "chau3" 
		
		/*
		 * System.out.println("el foreach de set es"); 
		 * for(String s: setString) {
		 * System.out.println(s); }
		 */ 
		//el set funciona si el hashCode y el equals estan sobreEscirtos
		 Persona p1 = new Persona("Juan","pachano");
		 Persona p2 = new Persona("Marcelo","pachano");
		 Persona p3= new Persona("Juan","pachano");
		 Set<Persona> setPersonas = new HashSet<>();
		 setPersonas.add(p1);
		 setPersonas.add(p1);
		 setPersonas.add(p2);
		 for(Persona s: setPersonas) {
			  System.out.println(s.getNombre()); }
		//como no tiene objetos repetidos  cuando hacemos el add de un objeto calcula el hashcode y ese numero va a una 
		 //posicion de memoria, si esa posicion esta ocupada le hace el equals al que ahi esta
		 //si es igual lo pisa , si da false lo agrega abajo
	 
		
	/*
	 TreeSet<>();
	 es igual al hash set pero
	 ordena a partir de su posicion de acuerdo al tipo de elemento
	 los numero de manera ascendente, el string segun el alfabeto
	 para objetos propios tenemos q implementar el ordenamiento
	 usando la intrfaz Comparable y sobre escribir el compareTo();
	 
	 */
	//Set<Persona> setTree = new TreeSet<>(); ???
	
	/*
	 MAP 
	  !!!!!!! no hereda de Collection   !!!!!
	  un MAP es un diccionario de datos, tiene dos elementos
	  key y value.
	  No son para recorrer, son para guardar diferente tipo de informacion 
	  
	 */
	 //String va a ser clave y persona como valor
	Map<String,Persona> mapa = new HashMap<>();
	//como no hereda de collecition no tiene .add
	Persona auxP = new Persona("Es","un Ejemplo"); 
	mapa.put("user", auxP); //las claves son unicas no puedo hacer otro put a "user"
	System.out.println(auxP.toString());
	Persona value = mapa.get("user");
	Set<String> s = mapa.keySet(); // me devuelve todas las claves 
	//no son para recorrer por eso es tanta vuelta
	System.out.println(value.toString());
	
	}
	
}


