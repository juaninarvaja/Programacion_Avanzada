//package clase2;
package clase2;

public class Program {
	public static void main(String[] args) {
		//Persona p = new Persona();
		//p.setNombre("Matias");
		String s = "Matias";
		//System.out.println(s.charAt(5));
		//System.out.println(s.substring(2,5));
		//MATIAS 
		//012345 incluye el primero  y excluye el beggin
		//si quiero ir hasta el final
//		System.out.println(s.substring(2,s.length()));
//		System.out.println(s.startsWith("Ma")); //devuelve true si empieza igual
//		System.out.println(s.endsWith("s")); //si termina en
		//s = s.toUpperCase(); //tengo q pisar la referencia
		
		//para validar q no esta vacio y no el lenght
		//el lenght recorre todo para ver cuantos tiene, en cambio el isEmpty es mas performante
		//tampoco usar el s.equals("")
		//se puede usar if("Matias".equals(s)){} 
		if(s!= null && s.isEmpty()) {
			System.out.println("no tiene nada");
		}else {
			System.out.println("tiene algo");
		}
		
		String otro = "otro ";
		//System.out.println(s +" "+ otro);
		System.out.println(s.concat("  ").concat(otro)); //esto es mucho mas performante
		
		
//		s = s.replaceAll("a","4"); //cambia las a por 4
//		System.out.println(s);
		
	}

}