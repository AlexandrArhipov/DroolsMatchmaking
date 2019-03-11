package com.arkhipov.drools;

public class Launcher {
    private static final int NumberOfServers = 10;
    private static final int NumberOfUsers = 160;

    public static void main(String[] args) {
        ServerRepository serverRepository = new ServerRepository(NumberOfServers);
        UserRepository userRepository = new UserRepository(NumberOfUsers);

        for (User user : userRepository.getUsers()) {
            Server bestServer = serverRepository.findBestServerForUser(user);
            bestServer.addUser(user);
        }

        printResults(serverRepository);
    }

    private static void printResults(ServerRepository serverRepository) {
        for (Server server : serverRepository.getServers()) {
            StringBuilder stringBuilder = new StringBuilder(server.getName() + ":\n");

            for (User user : server.getUsers()) {
                stringBuilder.append(user.getName());
                stringBuilder.append("\n");
            }

            System.out.println(stringBuilder.toString() + "\n");
        }
    }
}