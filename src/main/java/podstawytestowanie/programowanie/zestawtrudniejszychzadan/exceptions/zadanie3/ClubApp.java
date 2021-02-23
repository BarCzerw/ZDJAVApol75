package podstawytestowanie.programowanie.zestawtrudniejszychzadan.exceptions.zadanie3;

public class ClubApp {

    public static void main(String[] args) {

        Club hawana = new Club();

        Person adult = new Person("Adam", "Małysz", 36);
        Person minor = new Person("Maciej", "Kot", 14);

        try {
            hawana.enter(adult);
            hawana.enter(minor);
        } catch (NoAdultException e) {
            e.printStackTrace();
        }



    }

}
