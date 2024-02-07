import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;



public class Data_Base {
    public static void main(String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC");

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm = con.createStatement();


        ResultSet rs = stm.executeQuery("select * from students");

        while(rs.next())
        {
            System.out.print(rs.getInt("rollno")+" ");
            System.out.print(rs.getString("name")+" ");
            System.out.print(rs.getString("city")+" ");
            System.out.println(rs.getInt(4)+" ");
        }
    }
}
