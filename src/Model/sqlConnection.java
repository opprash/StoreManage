package Model;

import java.sql.*;

public class sqlConnection {

    private final String url = "jdbc:mysql://localhost:3306/storehouse??characterEncoding=utf8&useSSL=true";
    private final String name = "root";
    private final String pwd = "123";
    private final String jdbc = "com.mysql.jdbc.Driver";

    public Connection getCon() throws Exception {
        Class.forName(jdbc);
        Connection con = DriverManager.getConnection(url,name,pwd);
        return con;
    }

    private void closeCon(Connection con) throws SQLException {
        if(con != null)
            con.close();
    }

    public static void main(String [] args)
    {
        sqlConnection sql = new sqlConnection();
        try {
            sql.getCon();
            System.out.println("Connection succeed");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
