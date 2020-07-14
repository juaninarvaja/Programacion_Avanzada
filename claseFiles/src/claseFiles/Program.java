package claseFiles;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Program {
	
	
	public static void main (String[] args) throws IOException {
		
		/* Archivo fisico*/
		File archivoF = new File("archivo.txt"); // aca ya existe el archivo pero en RAM
		File carpetaA = new File("C:\\Users\\Public\\Pictures\\Sample Pictures");
		try {
			if(!archivoF.exists() ){
				
				archivoF.createNewFile(); ///creo archivo
				}
			if(!carpetaA.exists() ){
				
				carpetaA.mkdirs(); ///creo carpeta imagenes/otro
				}
		}
		catch(Exception e) {
			e.getStackTrace();
		}
		
		/* if(carpetaA.isDirectory()) {
			//list devuelve los strigns de los nombres
			for(File s: carpetaA.listFiles()) {
				if(s.isFile()) {
					System.out.println(s.getName()); //s.getName() para listFile
				}
				//String s: carpetaA.listFiles() // solo devuelve los archivs no las carpetas
				
			}
		}
		*/ 
		
		/* try {
			// Lo que quereemos hacer con el archivo
			FileWriter fw = new FileWriter(archivoF); //archivo.txt;
			//FileWriter fw = new FileWriter(archivoF,true); ESTE NO PISA SINO QUE CONCATENA
			
			
			// como lo vamos a hacer
			BufferedWriter bw = new BufferedWriter(fw);
			for(File s: carpetaA.listFiles()) {
				if(s.isFile()) {
					bw.write(s.getName()); //s.getName() para listFile
					bw.newLine();
				}
				}
			bw.write("Hola Mundo!"); // el write pisa todo
			
			bw.flush(); //pasa todo de la RAM al disco.
			fw.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	*/
		
		/* try {
			FileReader fr = new FileReader(archivoF);
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while((s= br.readLine()) != null){
				System.out.println(s);
			}
			
			fr.close();
			
		} catch (Exception e) {
			e.getStackTrace();
			// TODO: handle exception
		}
		//System.getProperty("line.separator");
		 
		 */
		
		
		//hasta aca con texto plano, de aca para abajo con imagenes, pdf etc.
		
		/* File archivoImg = new File("jon.jpg"); //input
		File archivoSalida = new File("copyJon.jpg"); //output 
		try {
			FileInputStream fis =  new FileInputStream(archivoImg);
			//vamos a conectarnos al archivo sin bloquearlo 
			BufferedInputStream bis = new BufferedInputStream(fis);
			FileOutputStream fos =  new FileOutputStream(archivoSalida);
			BufferedOutputStream bos = new BufferedOutputStream(fos);	
			
			byte[] aux = new byte[1024];	
			int cantByteLeidos = 0;
			while((cantByteLeidos = bis.read(aux,0,1024)) > -1) {
				bos.write(aux, 0, cantByteLeidos); 
			}
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		
		List elemots = new ArrayList();
		
	}

}
