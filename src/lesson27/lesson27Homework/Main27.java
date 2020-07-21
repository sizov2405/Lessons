package lesson27.lesson27Homework;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main27 {
    public static void main(String[] args) {

        ArrayDeque<Client> queue = new ArrayDeque<>();
        Client secondClient = new Client();

        queue.addFirst(new Client());
        queue.addFirst(secondClient);
        showQueueInfo(queue);

        queue.addLast(new Client());
        queue.addFirst(new Client());
        showQueueInfo(queue);

        Client client = queue.pollLast();
        System.out.println("Last client was removed: " + client);
        queue.remove(secondClient);
        showQueueInfo(queue);

    }

    private static void showQueueInfo (ArrayDeque<Client> queue){
        System.out.println("************");
        for(Client client : queue){
            System.out.println(client);
        }
//        System.out.println(queue);
        System.out.println("************");
    }
}
