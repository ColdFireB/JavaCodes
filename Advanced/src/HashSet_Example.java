import java.util.HashSet;

public class HashSet_Example {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("BMW1");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");
    cars.add("Mazda");
    System.out.println(cars);
  }
}