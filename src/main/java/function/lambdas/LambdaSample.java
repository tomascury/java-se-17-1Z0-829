package function.lambdas;

public class LambdaSample {

  public static void main(String[] args) {

    // Before Java 8
    FunctionInterface functionInterface = new FunctionInterface() {
      @Override
      public void operation() {
        System.out.println("My implementation!");
      }
    };
    functionInterface.operation();

    // Since Java 8
    FunctionInterface functionInterfaceLambdaF = () -> System.out.println("My lambda implementation!");
    functionInterfaceLambdaF.operation();

    Evaluate<Integer> evaluate = i -> i < 0;
    System.out.printf("100 is negative? %s%n", evaluate.isNegative(100));
    System.out.printf("-99 is negative? %s%n", evaluate.isNegative(-99));
  }
}

interface FunctionInterface {
  void operation();
}

interface Evaluate<T> {
  boolean isNegative(T t);
}
