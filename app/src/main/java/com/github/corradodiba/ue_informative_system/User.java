package com.github.corradodiba.ue_informative_system;

public class User {
    public String email;
    public String password;

    private static final User ourInstance = new User();

    static User getInstance() {

        return ourInstance;
    }

    private User() {}

    public void setEmail(String newEmail) {
            this.email = newEmail;
        }
    public void setPassword(String newPassword) { this.password = newPassword; }
}
