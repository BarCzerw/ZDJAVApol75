package wstepoop.gitzadania.highway;

public class UnknownCommandArgumentException extends Throwable {
    public UnknownCommandArgumentException(String type) {
        System.out.println("Cannot resolve command argument - " + type);
    }
}
