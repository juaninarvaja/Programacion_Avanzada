import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class Conexion {
 //un metodo para abrir la conexion y uno para cerrar
//si es singleton mucho mejor
	private static Connection connection;
	
	@SuppressWarnings("finally")
	public Connection Open() {
		if(connection ==null) {
			try {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
					System.out.println("abrio correctamente!");
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
				catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
				}
			}
			finally {
					return connection;
				}
		}
		return null;
	}
	
	
	public boolean Close(){
		if(connection != null) {
			try {
				connection.close();
				return true;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return false;

	}
}
