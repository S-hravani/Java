import java.util.Scanner;

import java.sql.*;

public class Parameterised_Insert {
    public static void main(String args[])
    {
        int empid,salary;
        String firstname,lastname;

        try
        {
            char ch;
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/oral?characterEncoding=latin1","root","shravani");
            do
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the id = ");
                empid = sc.nextInt();
                System.out.println("Enter first name = ");
                firstname = sc.next();
                System.out.println("Enter last name = ");
                lastname = sc.next();
                System.out.println("Enter the salary = ");
                salary = sc.nextInt();
                String q = "insert into teacher(empid,firstname,lastname,salary) values(?,?,?,?)";
                PreparedStatement ps = con.prepareStatement(q);
                ps.setInt(1,empid);
                ps.setString(2,firstname);
                ps.setString(3,lastname);
                ps.setInt(4,salary);
                ps.executeUpdate();
                System.out.println("Do you want to continue? = ");
                ch = sc.next().charAt(0);
            }while(ch!='n');



        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
