package project.service;

import project.model.Client;

public interface ClientService {

    void addClient (Client client);

    void removeClient(long clientId);

    Client getClient(long clientId);

    void logCache();

}
