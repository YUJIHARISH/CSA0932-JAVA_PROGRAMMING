class Fibonacci {
  public static void main(String[] args) {

    int n = 100, a = 0, b = 1;
    System.out.println("The first 100 Fibonacci numbers:");
    for(int i = 1; i <= n; i++) {
      System.out.print(a + " ");
      int nextTerm = a + b;
      a = b;
      b = nextTerm;
    }
  }
}
