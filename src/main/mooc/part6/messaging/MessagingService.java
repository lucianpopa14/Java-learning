package src.main.mooc.part6.messaging;

import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> list;

    public MessagingService() {
        this.list = new ArrayList<>();
    }

    public void add(Message message) {
        if(message.getContent().length()<=280){
            list.add(message);
        }else System.out.println("message too long");
    }

    public ArrayList<Message> getMessage() {
        return list;
    }
    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("John","this is a test message");
        MessagingService ms = new MessagingService();
        ms.add(message);
        System.out.println(ms.getMessage());
    }
}
