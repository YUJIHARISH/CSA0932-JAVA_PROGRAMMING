import java.util.Scanner;

class Factorial {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt(); 
    long factorial = 1;
    System.out.print("Factorial of " + n + " is: ");
    for(int i = 1; i <= n; i++) {
      factorial *= i;
    }
    
    System.out.println(factorial);
  }
}
