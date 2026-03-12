package server.repositories;
import server.database.DatabaseManager;
import server.models.*;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;

public class EmailRepository {
    public List<Email> getUserEmails(UUID userId) throws SQLException
    {
        var con = DatabaseManager.getConnection();
        PreparedStatement statement = con.prepareStatement("SELECT * ")
    }
}
