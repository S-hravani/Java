import java.sql.*;

public class Select {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oral?characterEncoding=latin1","root","shravani");
            String q = "select * from teacher";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(q);
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));

            }
            System.out.println("Information displayed successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
