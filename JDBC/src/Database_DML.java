import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Database_DML {
    public static void main(String[] args) throws Exception{
        Class.forName("org.sqlite.JDBC");
        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        //With Statement Interface
//        Statement stm = con.createStatement();
//        stm.executeUpdate("insert into dept values(70, 'chem')"); // Inserting a new Row
//        stm.executeUpdate("delete from dept where deptno>50"); // Deleting a Row
//        stm.executeUpdate("update dept set dname='Chem' where deptno=50"); //Updating a Row

        //With Prepared Statement
        PreparedStatement stm = con.prepareStatement("insert into students values(?,?,?,?)");

        Scanner sc = new Scanner(System.in);

        System.out.println("enter all student data");
        int r = sc.nextInt();
        String name = sc.next();
        String city = sc.next();
        int dno = sc.nextInt();

        stm.setInt(1, r);
        stm.setString(2, name);
        stm.setString(3, city);
        stm.setInt(4, dno);

        stm.executeUpdate();

        stm.close();
        con.close();
    }
}
