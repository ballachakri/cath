package Important_Java_Topics;

import java.sql.*;

public class DatabaseConnection {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "admin");
        Statement stmt = con.createStatement();
        String qry = "select * from country";
        ResultSet res = stmt.executeQuery(qry);
        while (res.next()) {
            System.out.println(res.getString(1) + "\t" + res.getString(2));
        }
        con.close();

    }
}
