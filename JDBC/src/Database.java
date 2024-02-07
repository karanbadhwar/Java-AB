import java.sql.*;

class Database
{
    public static void main(String[] args) throws Exception
    {
        Class.forName("org.sqlite.JDBC"); // Loading classes from JDBC

        Connection con = DriverManager.getConnection("jdbc:sqlite:C://sqlite//univ.db");

        Statement stm = con.createStatement();

        ResultSet rs = stm.executeQuery("select * from dept");

        int dno;
        String dname;
        while(rs.next())
        {
            dname=rs.getString("dname"); // Regargless of the position of the column type
            dno=rs.getInt("deptno");

            System.out.println(dno + " " + dname);
        }
    }
}