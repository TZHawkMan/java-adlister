import java.sql.DriverManager;
import com.mysql.cj.jdbc.Driver;





public class JDBClecture {
    public static void main(String[] args) {
        DriverManager.registerDriver(new Driver());
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );
    }
}
