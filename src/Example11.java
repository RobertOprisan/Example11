import java.util.Scanner;
class Example11 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("Enter first number");
        Scanner inputValue;
        inputValue = new Scanner(System.in);
        a = inputValue.nextInt();

        System.out.println("Enter second number");
        inputValue = new Scanner(System.in);
        b = inputValue.nextInt();


        if (a > b) {
            System.out.println(b + "," + a);
        } else {
            System.out.println(a + "," + b);
        }
    }
}
