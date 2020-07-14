package ejercicio3;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		
		System.out.println("Ingrese palabra: ");
		Scanner sc = new Scanner(System.in);
		String texto = sc.nextLine();
		System.out.println(texto.toUpperCase());
		boolean continuar = true;
		while(continuar) {
		System.out.println("1- cantidad de digitos");
		System.out.println("2- primera mitad");
		System.out.println("3- ultimo caracter");
		System.out.println("4- dado vuelta");
		System.out.println("5 - Separado por guiones");
		System.out.println("6 - Buscar hola en texto");
		System.out.println("7 - eel string 4");
		System.out.println("8 - Salir");
		
		Scanner scOption = new  Scanner(System.in);
		String entrada = scOption.nextLine();
		ManejoString ms = new ManejoString();
			
			switch(entrada) {
			case "1": System.out.println("cantidad de digitos "); 
						System.out.println(ms.cantidad(texto));
						break;
			case "2": System.out.println("Primera Mitad "); 
					  System.out.println(ms.primeraMitad(texto));
					   break;
			case "3": System.out.println("Ultimo caracter"); 
						System.out.println(ms.ultimoCaracter(texto));
						break;
			case "4": System.out.println("dado vuelta"); 
					System.out.println(ms.formaInversa(texto));
					break;
			case "5": System.out.println("separado por guiones"); 
						System.out.println(ms.separadoGuiones(texto));
						break;
			case "6": System.out.println("contine hola?"); 
					   System.out.println(ms.poseeHola(texto));
					   break;
			case "7": System.out.println("en esa poscion"); 
					try {
				System.out.println(ms.caraterEnPos(texto, 4));
					}catch(Exception e) {
						e.printStackTrace();
						System.out.println(e.getMessage());
					}
						
				       break;
			case "8": continuar = false;
			   			break;
		
			}
		}
		
	}
}
