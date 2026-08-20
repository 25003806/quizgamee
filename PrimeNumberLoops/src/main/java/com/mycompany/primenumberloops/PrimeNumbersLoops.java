import java.util.*;
public class PrimeNumbersLoops {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter an equation: ");
    String eq = in.nextLine();
    double energy = Math.abs(eq.hashCode() % 10000) * 0.42;
    int universe = Math.abs(eq.hashCode() % 999);
    System.out.printf("Energy: %.2fQ → Universe-%03d%n", energy, universe);
  }
}
