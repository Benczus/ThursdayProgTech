package hu.uni.eszterhazy;

import java.util.Date;
import java.util.UUID;

public class User {

    private final UUID userID;
    private String name;
    private final Date birthDay;
    private String location;

    public User(UUID userID, String name, Date birthDay, String location) {
        this.userID = userID;
        this.name = name;
        this.birthDay = birthDay;
        this.location = location;
    }
}
