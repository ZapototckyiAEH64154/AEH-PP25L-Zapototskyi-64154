import java.util.Scanner;

public class SilniaCalculator {
    public static long silniaIteracyjnie(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Silnia nie jest zdefiniowana dla liczb ujemnych");
        }
        
        long wynik = 1;
        for (int i = 2; i <= n; i++) {
            wynik *= i;
        }
        return wynik;
    }
    public static long silniaRekurencyjnie(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Silnia nie jest zdefiniowana dla liczb ujemnych");
        }
        
        if (n == 0 || n == 1) {
            return 1;
        }
        
        return n * silniaRekurencyjnie(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj liczbę N do obliczenia silni: ");
        int n = scanner.nextInt();
        
        if (n > 20) {
            System.out.println("Uwaga: Dla N > 20 wynik może przekroczyć zakres typu long!");
        }
        
        long startTimeIteracyjnie = System.nanoTime();
        long wynikIteracyjnie = silniaIteracyjnie(n);
        long endTimeIteracyjnie = System.nanoTime();
        long executionTimeIteracyjnie = endTimeIteracyjnie - startTimeIteracyjnie;
        
        long startTimeRekurencyjnie = System.nanoTime();
        long wynikRekurencyjnie = silniaRekurencyjnie(n);
        long endTimeRekurencyjnie = System.nanoTime();
        long executionTimeRekurencyjnie = endTimeRekurencyjnie - startTimeRekurencyjnie;
        
        System.out.println("\nWyniki obliczeń silni dla N = " + n + ":");
        System.out.println("Metoda iteracyjna: " + wynikIteracyjnie);
        System.out.println("Czas wykonania (nanosekundy): " + executionTimeIteracyjnie);
        
        System.out.println("\nMetoda rekurencyjna: " + wynikRekurencyjnie);
        System.out.println("Czas wykonania (nanosekundy): " + executionTimeRekurencyjnie);
        
        System.out.println("\nPorównanie czasów wykonania:");
        if (executionTimeIteracyjnie < executionTimeRekurencyjnie) {
            System.out.println("Metoda iteracyjna jest szybsza o " + 
                    (executionTimeRekurencyjnie - executionTimeIteracyjnie) + " nanosekund.");
        } else if (executionTimeRekurencyjnie < executionTimeIteracyjnie) {
            System.out.println("Metoda rekurencyjna jest szybsza o " + 
                    (executionTimeIteracyjnie - executionTimeRekurencyjnie) + " nanosekund.");
        } else {
            System.out.println("Obie metody wykonały się w tym samym czasie.");
        }
        
        scanner.close();
    }
}