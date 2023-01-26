package function.predicates;

import java.util.function.*;

public class PredicateSample {

  public static void main(String[] args) {
    int x = 4;
    System.out.printf("Is %s even? %s%n", x, check(x, n -> n % 2 == 0));
    x = 7;
    System.out.printf("Is %s even? %s%n", x, check(x, n -> n % 2 == 0));

    BiPredicate<String, Integer> checkLength = (str, len) -> str.length() == len;
    String input = "Tom Ever";
    int length = 8;
    System.out.printf("Is the string '%s' with length equal to %s? %s", input, length, checkLength.test(input, length));

  }


  public static <T> boolean check(T t, Predicate<T> lambda) {
    return lambda.test(t);
  }
}
