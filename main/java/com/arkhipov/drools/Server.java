package com.arkhipov.drools;

import com.arkhipov.drools.utils.Coordinates;
import java.util.ArrayList;

public class Server {
    private Coordinates position;
    private String name;
    private ArrayList<User> users;
    private int userCount;

    public Server(String name, Coordinates position) {
        this.name = name;
        this.position = position;

        users = new ArrayList<User>();
    }

    public Coordinates getPosition() {
        return position;
    }

    public void setPosition(Coordinates position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public int getUserCount() {
        return users.size();
    }

    public double distanceToUser(User user) {
        return position.distanceTo(user.getPosition());
    }
}
