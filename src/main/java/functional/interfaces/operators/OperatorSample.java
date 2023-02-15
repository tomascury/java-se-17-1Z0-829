package functional.interfaces.operators;

import java.util.function.*;

public class OperatorSample {

  public static void main(String[] args) {

    // UnaryOperator<T> extends Function<T, T>
    UnaryOperator<String> unaryOperator = name -> "My name is " + name;
    System.out.printf("%s\n", unaryOperator.apply("Tom"));

    // BinaryOperator<T> extends BiFunction<T, T, T>
    BinaryOperator<String> binaryOperator = (s1, s2) -> s1.concat(s2);
    System.out.printf("%s\n", binaryOperator.apply("Tom ", "Curry"));
  }
}
