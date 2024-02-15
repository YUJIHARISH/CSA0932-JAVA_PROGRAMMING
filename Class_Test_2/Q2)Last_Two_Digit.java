import java.util.Scanner;
class LastTwoDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        int ldy = year%100;
        System.out.println("The last Two Digit of the  year is: "+ldy);
    }
}
