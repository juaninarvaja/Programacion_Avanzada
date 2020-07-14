package Ejercicio1;

public class Program {
	public static void main(String[] args) {
		Auto a = new Auto("OCB420",EMarca.Fiat,"Strada",500324.43f);
		Auto a2 = new Auto("GLW322",EMarca.Renault,"Parnter",534324.43f);
		Auto a3 = new Auto("KUL940",EMarca.Volskwagen,"Amarok",934324.43f);
		System.out.println(a.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
	}
}
