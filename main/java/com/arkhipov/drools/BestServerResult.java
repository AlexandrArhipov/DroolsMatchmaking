package com.arkhipov.drools;

import com.arkhipov.drools.utils.Coordinates;

public class BestServerResult {

    private Server result;

    public BestServerResult(Server server) {
        result = server;
    }

    public Server getResult() {
        return result;
    }

    public void setResult(Server result) {
        this.result = result;
    }

    public Coordinates getCoordinates() {
        return result.getPosition();
    }

    public double distanceToUser(User user) {
        return result.getPosition().distanceTo(user.getPosition());
    }

    public int getUserCount() {
        return result.getUserCount();
    }
}
