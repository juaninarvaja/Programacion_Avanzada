package clase1_ProgAvanzada;

public class Program {
	public static void main(String[] args) {

		Persona p1 = new Persona("Juan Pachano",40236460,0,true);
		System.out.println(p1.toString());
		Persona p2 = new Persona("Juan Pachano",40236460,0,true);
		
		//== compra las posiciones de memoria. 
		//entonces uso equals
		if(p1.equals(p2)) {
			System.out.println("Son iguales");
			System.out.println("P1 " + p1.hashCode());
			System.out.println("P2 " + p2.hashCode());
		}else {
			System.out.println("Son distintos");
			System.out.println("P1 " + p1.hashCode());
			System.out.println("P2 " + p2.hashCode());
		}
		
		
		
		
	}

}
