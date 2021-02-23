package podstawytestowanie.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class Inbox {

    Stack<Message> inbox = new Stack<>();

    public void addMessage(String content) {
        inbox.push(new Message(content));
    }

    public List<Message> getMessages() {
        Stack<Message> tempStack = inbox;
        List<Message> messageList = new ArrayList<>(tempStack);
        return messageList;
    }

    public Message eraseOldestMessage() {
        if (inbox.isEmpty()) {
            System.out.println("Nothing to delete!");
            return null;
        } else {
            Stack<Message> tempStack = new Stack<>();
            Message temp;

            while (inbox.size() > 1) {
                tempStack.push(inbox.pop());
            }
            temp = inbox.pop();
            System.out.println("Erased: " + temp);
            inbox = tempStack;
            return temp;
        }
    }

    public void printAllMessages() {
        Comparator<Message> cmpByArrival = new Comparator<Message>() {
            @Override
            public int compare(Message o1, Message o2) {
                return Duration.between(o1.getArrived(), o2.getArrived()).isZero() ? 0 : (Duration.between(o1.getArrived(), o2.getArrived()).isNegative() ? 1 : -1);
            }
        };
        if (!inbox.isEmpty()) {
            inbox.stream().sorted(cmpByArrival).forEach(System.out::println);
        } else {
            System.out.println("Inbox is empty!");
        }
    }

}
