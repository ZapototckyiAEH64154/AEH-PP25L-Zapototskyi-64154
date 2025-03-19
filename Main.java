import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x = 10 ;
        double y = 2;
        Scanner scanner = new Scanner(System.in);
        var result = x + y;
        System.out.println("x+y="+result);  
        result = x - y;
        System.out.println("x-y="+result);
        result = x*y;
        System.out.println("x*y="+result);
        result = x/y;
        System.out.println("x/y="+ result);
        result = x%y;
        System.out.println("x%y="+result);
        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        System.out.println(first + " + " + second + " = " + (first + second));
        int doubleX = 2 * x;
        int squareX = x * x;
        System.out.println("x = " + x);
        System.out.println("2 * x = " + doubleX);
        System.out.println("x^2 = " + squareX);
    }
}
