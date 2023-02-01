package function.lambdas;

import java.util.*;

public class MethodReferenceSample {

  public static void main(String[] args) {
    List<String> names = Arrays.asList("Kerkys", "Martin", "Vinhej");
    names.forEach(name -> System.out.println(name));// lambda version
    names.forEach(System.out::println);// method reference version
  }
}
