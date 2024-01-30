import java.sql.Connection;
import java.sql.DriverManager;
public class DBconnection {

    static Connection con;

    public static Connection createDBConnetion() {

        try {
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url = "jdbc:mysql://localhost:3306/empdb?useSSL=false";
            String username = "root";
            String password = "ironman123";
            con = DriverManager.getConnection(url, username, password);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return con;
    }
}
