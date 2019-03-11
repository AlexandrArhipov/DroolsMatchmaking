package com.arkhipov.drools;

import com.arkhipov.drools.utils.Coordinates;

public class User {
    private String name;
    private Coordinates position;

    public User(String name, Coordinates position) {
        this.position = position;
        this.name = name;
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
}
