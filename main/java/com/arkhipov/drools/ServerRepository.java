package com.arkhipov.drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import com.arkhipov.drools.utils.Coordinates;

import java.util.ArrayList;

public class ServerRepository {
    private ArrayList<Server> servers = new ArrayList<Server>();

    public ServerRepository(int numberOfServers) {
        for (int i = 0; i < numberOfServers; i++) {
            servers.add(new Server("Server" + (i + 1), Coordinates.RandomCoordinates()));
        }
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public Server findBestServerForUser(User user) {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession("ksession-rules");

        kSession.setGlobal("bestServer", new BestServerResult(servers.get(0)));
        kSession.setGlobal("user", user);

        for (Server server : servers) {
            kSession.insert(server);
        }

        kSession.fireAllRules();
        BestServerResult bestServer =  (BestServerResult) kSession.getGlobal("bestServer");
        return bestServer.getResult();
    }
}
