import java.util.Scanner;

public class AverageCalculator {

    public static void printAverage(double n) {
        double circum= 2*3.14*n;
        System.out.println(circum);
       
      }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter  radius: ");
    double n = scanner.nextDouble();

    

      printAverage(n);
  }

  
}
    

