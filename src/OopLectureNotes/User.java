package OopLectureNotes;

public class User {

    // setting up our fields for the User class
    public int id;
    private String username;
    private String password;
    public String email;
    private boolean isLoggedIn = false;

    // empty Constructor method for the User class.
    public User() {};

    // overloaded Constructor method
    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }
    // overloaded Constructor method
    public User(int id, String username, String password, String email, boolean isLoggedIn) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.isLoggedIn = isLoggedIn;
    }

    // SETTERS AND GETTERS FOR OUR PRIVATE FIELDS (username, password, isLoggedIn)

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword(){
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean loggedIn) {
        this.isLoggedIn = loggedIn;
    }

    // instance method (used to describe "this" particular instance of the User object)
    public void describeUser() {
        System.out.println("Username: " + this.username);
        System.out.println("Password: " + this.password);
        System.out.println("Email: " + this.email);
        System.out.println("Logged in? " + this.isLoggedIn);
    }

    public static void main(String[] args) {

        // assigning values to our User instance manually without constructor.
        User testUser = new User();
        testUser.id = 1;
        testUser.username = "jayman";
        testUser.password = "password";
        testUser.email = "jayman@email.com";

        System.out.println("Username: " + testUser.username);
        System.out.println("Password: " + testUser.password);
        System.out.println("Email: " + testUser.email);
        System.out.println("Logged in? " + testUser.isLoggedIn);

        // assigning values to our User instance using the overloaded method.
        User user2 = new User("codeup-dude", "gocodeup", "codeup@email.com");

        System.out.println("Username: " + user2.username);
        System.out.println("Password: " + user2.password);
        System.out.println("Email: " + user2.email);
    }
}
