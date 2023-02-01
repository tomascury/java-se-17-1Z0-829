package function.lambdas;

import java.util.function.*;

public class EffectivelyFinalSample {

  public static void main(String[] args) {

    String name = "Tom";
    //name = "s"; Variable used in lambda expression should be final or effectively final
    Predicate<String> isEqualTom = s -> s.equals(name);

    System.out.printf("%s", isEqualTom.test("Tom"));
  }
}
