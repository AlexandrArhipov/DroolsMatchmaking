package com.arkhipov.drools.utils;

import com.arkhipov.drools.BestServerResult;
import com.arkhipov.drools.Server;
import com.arkhipov.drools.User;

public class Utils {
    public static boolean checkDistance(User user, Server server, BestServerResult bestServerResult) {
        return Coordinates.distance(user.getPosition(), server.getPosition()) < Coordinates.distance(user.getPosition(), bestServerResult.getCoordinates());
    }
}
