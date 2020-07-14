package ejercicio3;
//como comentar pongo barra ** enter
/* */ 
/**
 * 
 * 	@author Juan
 *	@version 1.0
 *	
 */
public class ManejoString {

	/** 
	 * cuenta cantidad de caracteres de un string, si es null da 0
	 * @param s String a contar
	 * @return cantidad de caracteres
	 */
	public int cantidad(String s){
		if(s!= null ) {
			return s.length();
		}else return 0;
	}

	public String primeraMitad(String s) {
		if(s!=null) {
			int divisor = s.length()/ 2;
			System.out.println(divisor);
			return s.substring(0,divisor);}
		else return "";
	}
	public char ultimoCaracter (String s) {
		char aux = 'ñ';
		if(s!=null) {
			return s.charAt(s.length() -1);
		}
		else return aux;
	}
	public String formaInversa(String s) {
		if(s!=null) {
			StringBuilder input1 = new StringBuilder();
			input1.append(s); 
	        // reverse StringBuilder input1 
	        input1 = input1.reverse(); 
	        return input1.toString();
		}
		else return ""; 
        
	}
	public String separadoGuiones (String s) {
		if(s != null) {
			String auxS = "";
			for(int i = 0; i < s.length();i++) {
				if(i + 1 !=s.length()) {
					auxS = auxS.concat(s.charAt(i)+"-");
				}
				
				if(i +1==s.length()) {
					auxS = auxS.concat(s.charAt(i) +" ");
				}
			}
			return auxS;
		}else
		return "";
	}
	
	public boolean poseeHola(String s) {
		if(s!=null) {
			s = s.toLowerCase();
			if(s.contains("hola")){
				return true;
			}
			else return false;
		}else return false;
	}
	
	public char caraterEnPos(String s,int i) throws Exception {
		if(i<0) {
			throw new Exception("Esto no anda mono");
		}
		else if(i>s.length()){
			System.out.println("entrea en mi uncheked");
			throw new Exception("Esto no anda mono");
			//throw new MiUncheckedException();
		}
		return s.charAt(i);
	}
	
	public String segundaPalabra(String palabra)
		throws ArrayIndexOutOfBoundsException {
		
		String[] palabras = palabra.split(" ");
		return palabras[1];
		}

}
