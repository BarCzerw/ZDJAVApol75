package podstawytestowanie.programowanie.zestawtrudniejszychzadan.obiektowosczkolekcjami.zadanie2;

import java.time.Duration;
import java.time.LocalTime;

public class Client implements Comparable<Client> {

    private final String name;
    private final LocalTime timeOfArrival;
    private final boolean isPriority;

    public Client(String name, LocalTime timeOfArrival, boolean isPriority) {
        this.name = name;
        this.timeOfArrival = timeOfArrival;
        this.isPriority = isPriority;
    }

    @Override
    public String toString() {
        return name + " - " + (isPriority ? "prio" : "norm") + " - " + timeOfArrival ;
    }

    @Override
    public int compareTo(Client o) {
        if(this.isPriority && !o.isPriority){
            return -1;
        }else if(!this.isPriority && o.isPriority){
            return 1;
        }else {
            if(Duration.between(this.timeOfArrival,o.timeOfArrival).isNegative()){
                return 1;
            }else {
                return -1;
            }
        }
    }
}
