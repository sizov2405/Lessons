package project.service;

import project.model.Client;
import project.cache.ClientCache;

public class ClientServiceImpl implements ClientService {

    private ClientCache clientCache = new ClientCache();

   @Override
   public void addClient(Client client){
        clientCache.addClient(client);
    }

    @Override
    public void removeClient(long clientId){
        clientCache.removeClientById(clientId);
    }

    @Override
    public Client getClient(long clientId){
        return clientCache.getClientById(clientId);
    }

    @Override
    public void logCache(){
        clientCache.logCache();
    }

}
