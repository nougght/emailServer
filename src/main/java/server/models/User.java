package server.models;

import java.time.OffsetDateTime;
import java.util.UUID;

public class User {
    UUID user_id;
    String username;
    String email;
    OffsetDateTime created_at;
}
