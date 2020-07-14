import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;

public class Program {

	public static void main (String[] args) {
		Empleado emp = new Empleado();
		Empleado auxEmp = new Empleado();
		emp.setNombre("Juan");
		emp.setSalario(BigDecimal.valueOf(30500,00));
		serialize(emp);
		auxEmp = deserialize();
		System.out.println(auxEmp.getNombre());
	}
	private static void serialize(Empleado emp) {
		System.out.println("entro a serializar");
		File file = new File("data","emp2.bin");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos =  new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(emp);
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO Auto-generated catch block
			
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
		finally {
			try {
				//valido q no sea null
				if(oos!= null) {
					oos.close(); //el close siempre en el finally 
				}				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	private  static Empleado deserialize() {
		System.out.println("entro a DESserializar");
		Empleado emp = null;
		File file = new File("data","emp2.bin");
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			emp = (Empleado) ois.readObject();
			
			ois.close();
		 	}
			catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}

		 return emp;
	}
}
