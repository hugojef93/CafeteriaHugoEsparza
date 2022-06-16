
package MetodosReutilizables;

import java.sql.*;

public class ConectarDriver {
    
    
    public static Connection conectar(String bd, String user, String password) throws SQLException {
        Connection con;
        con = DriverManager.getConnection(bd, user, password);
        return  con;
        
    }
}
