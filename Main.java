import java.sql.*;

class Main {
    public static void main(String args[]) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/university",
            "root",
            "123456");

            System.out.println("Database Connected");

        }
        catch(Exception e){
            System.out.println(e);
        }

    }
}