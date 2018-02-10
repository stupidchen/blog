package com.stupidchen.blog.model;

/**
 * Created by mike on 2/10/18.
 */
public class User {
    private String username;

    private String email;

    private String information;

    public String getUsername() {
        return username;
    }

    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getInformation() {
        return information;
    }

    public User setInformation(String information) {
        this.information = information;
        return this;
    }
}
