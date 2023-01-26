package lambdas;

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
  }
}

interface FunctionInterface {

  void operation();
}