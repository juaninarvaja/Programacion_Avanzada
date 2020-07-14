import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
		String palabra = "Hola";
		Integer numero = 1;
		mostra(palabra);
		mostra(1);
		List<String> palabras = new ArrayList<>();
		palabras.add("Hola");
		List<Integer> numeros = new ArrayList<>();
		numeros.add(1);
		mostraListas(palabras);
		mostraListas(numeros);
	}
	
	public static void mostra(Object s) {
		System.out.println(s);
		//string hereda de la clase object 
	}
	
	//el ? es el comodin
	//por defecto el ? acepta cualquier osa tipo object
	//puedo poner List<? extends Number>         y solo aceptaria integer, double, etc.ectc.
	
	public static void mostraListas(List<?> lista) {
		for(Object s : lista) {
			//una lista no hereda de la lista de strings
			//por lo tanto es necesario usar un comodin o wildcard 
			System.out.println(s);
		}
	}
}
