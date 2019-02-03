import java.util.ArrayList;

public class User {
    public static ArrayList<User> registeredUsers = new ArrayList<User>();
    
    public String name;
    public String surname;
    public Day birthday;

    public User(String name, String surname, Day birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;

        registeredUsers.add(this);
    }
}