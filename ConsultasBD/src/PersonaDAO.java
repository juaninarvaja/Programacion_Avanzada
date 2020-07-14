import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDAO {

	public void altaPersona(Persona p) {
		Conexion c = new Conexion();
		Connection con = c.Open(); //el abrir de conexion
		PreparedStatement pst;
		try {
			pst = con.prepareCall("INSERT INTO `persona`(`nombre`, `apellido`, `dni`, `id`) VALUES ('"+p.getNombre()+"',?,?,?)");
			pst.setString(1,p.getApellido());
			pst.setInt(2,p.getDni());
			pst.setLong(3,p.getId());
			pst.execute();
			System.out.println("dio de alta correctamente");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			if(e.getErrorCode() == 1062) {
				System.out.println("Error! El id esta duplicado");
			}
			else {
				e.printStackTrace();
				System.out.println(e.getErrorCode());
			}

	
		}
		
	}
	
	
	public Persona obtenerById(Long id) {
		Conexion c = new Conexion();
		Connection con = c.Open();
		PreparedStatement pst;
		try {
			pst = con.prepareCall("SELECT * FROM `persona` WHERE id = ?");
			pst.setLong(1,id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
					
				Persona p  = new Persona(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getLong(4));
				System.out.println("Busco correctamente!");
				return p;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}
	
	
	//baja
	public boolean bajaPersonaById(Long id) {
		Conexion c = new Conexion();
		Connection con = c.Open();
		PreparedStatement pst;
		try {
			pst = con.prepareCall("DELETE FROM `persona` WHERE id = ?");
			pst.setLong(1,id);
	
			int x = pst.executeUpdate();
			if(x != 0) {
				System.out.println("Elimino correctamente!");
				return true;
			}
			else {
				System.out.println("No existe persona con este id");
				return false;
			}
		
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return false;
	}
	
		//modificacion 
	
	public boolean modificarPersona(Long id, Persona p) {
		Conexion c = new Conexion();
		Connection con = c.Open();
		PreparedStatement pst;
		try {
			pst = con.prepareCall("UPDATE `persona` SET `nombre`= ?,`apellido`=?,`dni`=? WHERE `id` = ?");
			pst.setString(1, p.getNombre());
			pst.setString(2, p.getApellido());
			pst.setInt(3,p.getDni());
			pst.setLong(4,id);
			int retorno = pst.executeUpdate();
			System.out.println("modifico correctamente?" + retorno);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return false;
	}
		//obtener todos 
	
	public List<Persona> todosPersonas() {
		List<Persona> lista = new ArrayList<>();
		Conexion c = new Conexion();
		Connection con = c.Open();
		PreparedStatement pst;
		
		try {
			pst = con.prepareCall("SELECT * FROM `persona` WHERE  1");
			//pst.setLong(1,id);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				
				//System.out.println(rs.getString("nombre") + "\n");
				Persona p  = new Persona(rs.getString(1),rs.getString(2),rs.getInt(3),rs.getLong(4));
				lista.add(p);
				//System.out.println("Busco correctamente!");
				//return p;
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
				
		return lista;
	}

}
	
