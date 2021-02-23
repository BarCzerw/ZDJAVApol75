package podstawytestowanie.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie2;

public class Main {

    public static void main(String[] args) {
        Queue queue = new Queue();
        boolean isContinue;
        do {
            isContinue = queue.readNextClient();
        } while (isContinue);
        queue.printAllRemainingClients();
    }

}
