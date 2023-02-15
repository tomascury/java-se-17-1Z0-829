package functional.interfaces.suppliers;

import java.time.*;
import java.util.function.*;

public class SupplierSample {

  public static void main(String[] args) {
    Supplier<StringBuilder> stringBuilderSupplier = () -> new StringBuilder();
    System.out.printf("SB supplier added: %s%n", stringBuilderSupplier.get().append("Added"));

    Supplier<LocalTime> localTimeSupplier = () -> LocalTime.now();
    System.out.printf("Local time is %s%n", localTimeSupplier.get());

    Supplier<Double> doubleSupplier = () -> Math.random();
    System.out.printf("Random double %s%n", doubleSupplier.get());
  }
}
