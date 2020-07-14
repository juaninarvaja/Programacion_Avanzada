package tryCatchConJava7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Program {
	public static void main (String[] args) throws IOException {
		
		File f = new File("obj.txt");
		FileWriter fw = null;
		//BufferedWriter bw = null;
		//A partir de java 7 se incorpora el try con recursos 
		//abro parentesis y declaro los new de los objetos q s tienen que cerrrar ahi
		//cualquier elemento que implemente Closeable 
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {
			//fw =new FileWriter(f);
			bw.write("Texto");
			// bw = new BufferedWriter(fw);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		//ESTO YA NO VA
		/*finally {
			if(bw!=null) {
				bw.close();
			}
		} */  
		
	}
}
