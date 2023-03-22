import java.sql.*;

public class Create_table {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oral?characterEncoding=latin1","root","shravani");
            Statement stmt = con.createStatement();
            String q = "create table teacher(empid integer not null,firstname varchar(255),lastname varchar(255),salary integer)";
            stmt.execute(q);
            System.out.println("teacher Table Created");
            con.close();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
