package functionalprogramming.testrground.supplier;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        getValue(() -> "supplier test!");

    }

    public static void getValue(Supplier<String> supplier) {
        System.out.println(supplier.get());
    }
}
