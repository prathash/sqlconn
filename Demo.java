import java.sql.*;
class Demo
{
public static void main(String args[])
{
try
{
Connection con=null;
Statement stmt=null;
ResultSet rs=null;
class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("connection done");
con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:8080:xe","system","system");
stmt=con.createStatement();
rs=stmt.executeQuery("select * from student");
while(rs.next())
{
System.out.println("id is "+rs.getInt(1));
System.out.println("Name is "+rs.getString(2));
System.out.println("address is "+rs.getString(3));
}
}
catch (ClassNotFoundException e)
{
System.out.println("class not found" +e);
}
catch (SQLException e1)
{
System.out.println("sql error" +e1);
}
}
}
