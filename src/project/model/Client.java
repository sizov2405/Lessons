package project.model;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Client {

    private long clientId;
    private static long counterId;
    private String name;
    private String surname;
    private int age;
    private Set<Long> creditCardsIds;
    //private long creditCardId;

    public Client(String name, String surname, int age, Set<Long> creditCardsIds) {
        counterId++;
        this.clientId = counterId;
        this.name = name;
        this.surname = surname;
        this.age = age;
      this.creditCardsIds = creditCardsIds;
    }

    public void addCreditCardId(long creditCardId){
        creditCardsIds.add(creditCardId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return clientId == client.clientId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientId);
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", creditCardId=" + creditCardsIds +
                '}';
    }

    public long getClientId() {
        return clientId;
    }

    public Set<Long> getCreditCardsIds() {
        return creditCardsIds;
    }
}
