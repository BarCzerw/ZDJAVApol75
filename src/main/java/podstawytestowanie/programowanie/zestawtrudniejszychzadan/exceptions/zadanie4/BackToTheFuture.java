package podstawytestowanie.programowanie.zestawtrudniejszychzadan.exceptions.zadanie4;

import podstawytestowanie.programowanie.zestawzadan.Input;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BackToTheFuture {

    public static void main(String[] args) {

        long result=-1;
        System.out.println("Calculates remaining days to given date.");
        do {
            try {
                result=daysTo(readDateFromConsole());
            }catch (DateNotInFutureException ex){
            }catch (Exception ex){
                System.err.println("Error while entering date format");
            }
        }while (result == -1);
        System.out.println(result);
    }

    public static long daysTo(LocalDate dateInFuture) throws DateNotInFutureException {
        long days = ChronoUnit.DAYS.between(LocalDate.now(), dateInFuture);
        if (ChronoUnit.DAYS.between(LocalDate.now(), dateInFuture) < 0) {
            throw new DateNotInFutureException();
        }else {
            return days;
        }
    }

    public static LocalDate readDateFromConsole() {
        return LocalDate.parse(Input.readString("Date: "));
    }

}
