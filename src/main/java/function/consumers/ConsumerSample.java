package function.consumers;

import java.util.*;
import java.util.function.*;

public class ConsumerSample {

  public static void main(String[] args) {

    Consumer<String> print = s -> System.out.printf("input == %s%n", s);
    print.accept("Hello world!");

    List<String> names = new ArrayList<>();
    names.add("Tom");
    names.add("John");
    names.add("Mary");
    names.forEach(print);

    Map<String, String> capitalCities = new HashMap<>();

    BiConsumer<String, String> capitalCitiesConsumer =
        (key, value) -> capitalCities.put(key, value);// Lambda can be replaced with method reference capitalCities::put;
    capitalCitiesConsumer.accept("Brasília", "Brazil");
    capitalCitiesConsumer.accept("Lisbon", "Portugal");
    capitalCitiesConsumer.accept("Berlin", "Germany");

    BiConsumer<String, String> printMap = (key, value) -> System.out.printf("%s is the capital of %s.%n", key, value);
    capitalCities.forEach(printMap);

  }
}
