import java.sql.*;

public class Insert {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oral?characterEncoding=latin1","root","shravani");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("insert into teacher values (1,'Ashwini','Patil',2000)");
            stmt.executeUpdate("insert into teacher values(2,'Savita','Patil',3000)");
            stmt.executeUpdate("insert into teacher values(3,'Priyanka','Patil',4000)");

            System.out.println("Records inserted successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
