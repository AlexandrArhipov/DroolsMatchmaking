package com.arkhipov.drools;

import com.arkhipov.drools.utils.Coordinates;

import java.util.ArrayList;

public class UserRepository {
    private ArrayList<User> users = new ArrayList<User>();

    public UserRepository(int numberOfUsers) {
        for (int i = 0; i < numberOfUsers; i++) {
            users.add(new User("User" + (i+1), Coordinates.RandomCoordinates()));
        }
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
