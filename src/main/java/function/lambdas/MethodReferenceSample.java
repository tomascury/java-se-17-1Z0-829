package function.lambdas;

import java.util.*;
import java.util.function.*;

public class MethodReferenceSample {
  /***
   * Method Reference Types:
   * Bound - instance known at compile-time
   * Unbound - instance provided at runtime
   * Static
   * Constructor
   *
   * * The compiler turns the method reference into lambdas in the background.
   */
  public static void main(String[] args) {
    List<String> names = Arrays.asList("Kerkys", "Martin", "Vinhej");
    names.forEach(name -> System.out.println(name));// lambda version
    names.forEach(System.out::println);// method reference version

    String name = "Mr. John Lennon";

    Supplier<String> lowerCaseL = () -> name.toLowerCase(); // lambda
    Supplier<String> lowerCaseMR = name::toLowerCase; // bound method reference
    System.out.println(lowerCaseL.get());
    System.out.println(lowerCaseMR.get());

    Predicate<String> titleL = (title) -> name.startsWith(title);// lambda
    Predicate<String> titleMR = name::startsWith;// bound method reference
    System.out.println(titleL.test("Mrs."));
    System.out.println(titleMR.test("Mr."));

    Function<String, String> upperL = s -> s.toUpperCase();// lambda
    Function<String, String> upperMR = String::toUpperCase;// unbound method reference
    System.out.println(upperL.apply("lower"));
    System.out.println(upperMR.apply("lower"));

    BiFunction<String, String, String> concatL = (s1, s2) -> s1.concat(s2);// lambda
    BiFunction<String, String, String> concatMR = String::concat;// unbound method references
    System.out.println(concatL.apply("It's", " lambda"));
    System.out.println(concatMR.apply("It's", " unbound method reference"));

    Consumer<List<Integer>> sortL = list -> Collections.sort(list);// lambda
    Consumer<List<Integer>> sortMR = Collections::sort;// static (unbound) method reference

    List<Integer> numbers = Arrays.asList(1, 45, 7, 4, 90);
    sortL.accept(numbers);
    System.out.println(numbers);

    numbers = Arrays.asList(45, 89, 5, 1, 23, 900);
    sortMR.accept(numbers);
    System.out.println(numbers);


    Function<Integer, List<String>> arrayL = x -> new ArrayList<>(x);// lambda
    Function<Integer, List<String>> arrayMR = ArrayList::new;// constructor method reference
    List<String> l1 = arrayL.apply(2);
    l1.add("1");
    l1.add("2");
    System.out.println(l1);
    List<String> l2 = arrayMR.apply(2);
    l2.add("10");
    l2.add("100");
    System.out.println(l2);

    //Context for Method References
    Supplier<Integer> sHowManyAnimalsL = () -> Animal.howMany(); // lambda
    Supplier<Integer> sHowManyAnimalsMR = Animal::howMany; // method reference
    System.out.println(sHowManyAnimalsL.get());
    System.out.println(sHowManyAnimalsMR.get());

    Function<Animal, Integer> fHowManyAnimalsL = Animal -> Animal.howMany(Animal); // lambda
    Function<Animal, Integer> fHowManyAnimalsMR = Animal::howMany; // method reference
    System.out.println(fHowManyAnimalsL.apply(new Animal()));
    System.out.println(fHowManyAnimalsMR.apply(new Animal()));

    BiFunction<Animal, Animal, Integer> bfHowManyAnimalsL = (p1, p2) -> Animal.howMany(p1, p2); // lambda
    BiFunction<Animal, Animal, Integer> bfHowManyAnimalsMR = Animal::howMany; // method reference
    System.out.println(bfHowManyAnimalsL.apply(new Animal(), new Animal()));
    System.out.println(bfHowManyAnimalsMR.apply(new Animal(), new Animal()));
  }
}

class Animal {
  public static Integer howMany(Animal... animals) {
    return animals.length;
  }
}
