
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import io.github.cdimascio.dotenv.Dotenv;
import server.TestServer;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main
{
    public static void main() throws Exception {
        // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the
        // highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        Class.forName("org.postgresql.Driver");

        Dotenv dotenv = Dotenv.load();
        System.out.println(dotenv.get("DB_URL"));
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/email",
                "postgres", "3313");
        Statement statement = connection.createStatement();
        ResultSet results = statement.executeQuery("SELECT * FROM users");


        while (results.next()){
            var uuid = results.getString("user_id");
            var username = results.getString("username");
            System.out.println(uuid +"\t"+ username);
        }
        new TestServer(3741);
    }
}

