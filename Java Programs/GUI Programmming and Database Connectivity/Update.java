import java.sql.*;
public class Update {
    public static void main(String args[])
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oral?characterEncoding=latin1","root","shravani");
            Statement stmt = con.createStatement();
            stmt.executeUpdate("update teacher set salary=1500 where empid=1");
            ResultSet rs = stmt.executeQuery("select * from teacher");
            while(rs.next())
            {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));

            }
            System.out.println("information updated successfully");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

}
