import java.sql.*;

public class Create_DB {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?characterEncoding=latin1","root","shravani");
            Statement stmt = con.createStatement();
            String q = "create database practical";
            stmt.execute(q);
            System.out.println("Database Created");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}