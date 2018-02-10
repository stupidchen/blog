package com.stupidchen.blog.data;

/**
 * Created by mike on 2/10/18.
 */
public class UserData {
    private String id;

    private String username;

    private String email;

    private String password;

    private String information;

    public String getId() {
        return id;
    }

    public UserData setId(String id) {
        this.id = id;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserData setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserData setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserData setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getInformation() {
        return information;
    }

    public UserData setInformation(String information) {
        this.information = information;
        return this;
    }
}
