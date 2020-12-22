package project.cache;

import project.model.Client;

import java.util.HashMap;
import java.util.Map;

public class ClientCache {

    private Map<Long, Client> clients = new HashMap<>();

    public void addClient (Client client){
        clients.put(client.getClientId(), client);
    }

    public void removeClientById (long clientId){
        clients.remove(clientId);
    }

    public Client getClientById (long clientId){
        return clients.get(clientId);
    }

    public void logCache(){
        System.out.println("*******\nCLIENTS\n\n" + clients + "\n*******");
//        System.out.println("******");
//        System.out.println(clients);
//        System.out.println("******");
    }

}
