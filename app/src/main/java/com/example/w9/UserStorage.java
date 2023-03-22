package com.example.w9;

import java.util.ArrayList;

public class UserStorage {
    // instance
    private static UserStorage instance = null;
    private ArrayList<User> users = new ArrayList<User>();

    // private constructor
    private UserStorage() {}



    // methods:
    public ArrayList<User> getUsers() {
        return users;
    }
    // add
    public void addUser(String fn, String ln, String email, String degree) {
        User u1 = new User(fn, ln, email, degree);
        users.add(u1);
    }


    // getInstance
    public static UserStorage getInstance() {
        // if doesn't exist, create new
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }
}
