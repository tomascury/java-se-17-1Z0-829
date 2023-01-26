package function.functions;

import java.util.function.*;

public class FunctionSample {

  public static void main(String[] args) {

    //ToIntFunction<String> == Function<String, Integer>
    ToIntFunction<String> lengthFunction = String::length;
    String input = "Amsterdam";
    System.out.printf("%s string length equal to %d%n", input, lengthFunction.applyAsInt(input));

    //ToIntBiFunction<String, String> == BiFunction<<String, String, Integer>
    ToIntBiFunction<String, String> totalLength = (s1, s2) -> s1.length() + s2.length();

    String a = "William";
    String b = "Shakespeare";
    System.out.printf("Total length of strings '%s' and '%s' is %d%n", a, b, totalLength.applyAsInt(a, b));

  }
}
