
import com.mysql.jdbc.Driver;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Program {
	public static void main(String[] args) {
	
		//primero hago el import y despues lo copio, es mas facil.
		//agego el jar de bd
		
		
			
					//Conexion c = new Conexion();
					//Connection con = c.Open();
					Persona auxP = new Persona("nuevo","Lo aneterior de neuvo",123324,(long)5);
					PersonaDAO psDAO = new PersonaDAO();
					//psDAO.altaPersona(auxP);
					//psDAO.obtenerById((long)4);
					//psDAO.bajaPersonaById((long)3);
					//psDAO.modificarPersona((long)4, auxP);
					List<Persona> lista = new ArrayList<>();
					 lista = psDAO.todosPersonas();
					 for (Persona p: lista) {
						 System.out.println(p.toString());
					 }
						 
					
		
	}
}
					//se pueden genrar consultas de 3 tipos
					//tipo Statment
					//no hay q usarlo pq deja un hueco de seguirdad un enorme
					//es muy hackeable 
					//Statement st = connection.createStatement();
					//st.execute("INSERT INTO `persona`(`nombre`, `apellido`, `dni`, `telefono`) VALUES ('juan','narvaja',40236460,2284629470)");
					
					//PreparedStatemnt solo puede generar la consulta para la que fue creada
					//siempre usamos este 
					/*
					String nombre = "Juan";
					PreparedStatement st = 
							connection.prepareCall("INSERT INTO `persona`(`nombre`, `apellido`, `dni`, `telefono`) VALUES ('Juan','narvajaja',40236460,2284629470)");
					st.execute();
					
					PreparedStatement stSelect = 
							connection.prepareCall("select * from `persona`");
					ResultSet rs = stSelect.executeQuery();
					//genrar una lista de personas para guardarla
					while(rs.next()) {
						System.out.println(rs.getString(1));
						System.out.println(rs.getInt(3));
					}
					
					*/
					//es igual pero permite pasar parametros y tiene valor de retorno
					//CallableStatement cl = connection.prepareCall("INSERT INTO `persona`(`nombre`, `apellido`, `dni`, `telefono`) VALUES ('juancho','narvaja',40236460,2284629470)");
					//cl.execute();
					
					
					//connection.close();
					

