
package MetodosReutilizables;


import java.sql.*;

public class PreSelectWhere{

    public static void preSelectWhere(Connection con, String tabla, String campo, String busqueda) throws SQLException {
        PreparedStatement pst = null;
        ResultSet rs = null;
        String sqlpre = "'select * from "+tabla+" where "+campo+"= "+busqueda+"'";
        pst = con.prepareStatement(sqlpre);

        pst.setString(1, "%" + "hugo" + "%");
        rs = pst.executeQuery();

    }
}
