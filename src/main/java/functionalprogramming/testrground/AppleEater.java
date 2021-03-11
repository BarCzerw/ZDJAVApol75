package functionalprogramming.testrground;

@FunctionalInterface
public interface AppleEater<T> {
    void consume(T apple);
}
