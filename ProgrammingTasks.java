import java.util.Scanner;
import java.util.InputMismatchException;

public class ProgrammingTasks {

    public static void task1(Scanner scanner) {
        int lower, upper;

        while (true) {
            System.out.print("Podaj dolną i górną granicę liczby całkowitej (typ int): ");
            try {
                lower = scanner.nextInt();
                upper = scanner.nextInt();
                scanner.nextLine(); 
                break; 
            } catch (InputMismatchException e) {
                System.out.println("Błąd wprowadzania. Proszę podać dwie liczby całkowite oddzielone spacją.");
                scanner.nextLine(); 
            }
        }

        long sumOfSquares = 0;
        if (lower <= upper) { 
            for (int i = lower; i <= upper; i++) {
                sumOfSquares += (long)i * i; 
            }
        }
        System.out.printf("Suma kwadratów od %d do %d wynosi %d\n",
                          (long)lower * lower, (long)upper * upper, sumOfSquares);

        while (true) {
            int nextLower, nextUpper;
            
            while(true) {
                System.out.print("Podaj następny zestaw granic: ");
                try {
                    nextLower = scanner.nextInt();
                    nextUpper = scanner.nextInt();
                    scanner.nextLine(); 
                    break; 
                } catch (InputMismatchException e) {
                    System.out.println("Błąd wprowadzania. Proszę podać dwie liczby całkowite oddzielone spacją.");
                    scanner.nextLine(); 
                }
            }

            if (nextUpper <= nextLower) {
                System.out.println("Gotowe");
                break; 
            }

            sumOfSquares = 0; 
            for (int i = nextLower; i <= nextUpper; i++) {
                sumOfSquares += (long)i * i;
            }
            System.out.printf("Suma kwadratów od %d do %d wynosi %d\n",
                              (long)nextLower * nextLower, (long)nextUpper * nextUpper, sumOfSquares);
        }
    }

    public static void task2(Scanner scanner) {
        int choice = 0;

        while (true) {
            System.out.println("\nMenu kalkulatora:");
            System.out.println("1. Dodawanie");
            System.out.println("2. Odejmowanie");
            System.out.println("3. Mnożenie");
            System.out.println("4. Dzielenie");
            System.out.print("Wybierz opcję (1-4): ");

            try {
                if (scanner.hasNextInt()) {
                    choice = scanner.nextInt();
                    scanner.nextLine(); 
                    if (choice >= 1 && choice <= 4) {
                        break; 
                    } else {
                        System.out.println("Nieprawidłowy wybór. Proszę wprowadzić liczbę od 1 do 4.");
                    }
                } else {
                    System.out.println("Nieprawidłowe dane wejściowe. Proszę wprowadzić liczbę.");
                    scanner.nextLine(); 
                }
            } catch (InputMismatchException e) { 
                System.out.println("Nieprawidłowe dane wejściowe. Proszę wprowadzić liczbę.");
                scanner.nextLine(); 
            }
        }

        double num1 = 0, num2 = 0;

        while (true) {
            try {
                System.out.print("Podaj pierwszą liczbę: ");
                num1 = scanner.nextDouble();
                scanner.nextLine(); 
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane wejściowe dla pierwszej liczby. Proszę podać liczbę rzeczywistą.");
                scanner.nextLine(); 
            }
        }

        while (true) {
            try {
                System.out.print("Podaj drugą liczbę: ");
                num2 = scanner.nextDouble();
                scanner.nextLine(); 
                break;
            } catch (InputMismatchException e) {
                System.out.println("Nieprawidłowe dane wejściowe dla drugiej liczby. Proszę podać liczbę rzeczywistą.");
                scanner.nextLine(); 
            }
        }
        
        switch (choice) {
            case 1: 
                System.out.printf("Wynik: %.2f + %.2f = %.2f\n", num1, num2, (num1 + num2));
                break;
            case 2: 
                System.out.printf("Wynik: %.2f - %.2f = %.2f\n", num1, num2, (num1 - num2));
                break;
            case 3: 
                System.out.printf("Wynik: %.2f * %.2f = %.2f\n", num1, num2, (num1 * num2));
                break;
            case 4: 
                if (num2 == 0) {
                    System.out.println("Błąd: Dzielenie przez zero jest niemożliwe!");
                } else {
                    System.out.printf("Wynik: %.2f / %.2f = %.2f\n", num1, num2, (num1 / num2));
                }
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Wybierz zadanie do wykonania:");
        System.out.println("1. Zadanie 1 (Suma kwadratów)");
        System.out.println("2. Zadanie 2 (Kalkulator)");
        System.out.print("Twój wybór (1 lub 2): ");
        
        int taskChoice = 0;
        boolean validInput = false;

        if (scanner.hasNextInt()) {
            taskChoice = scanner.nextInt();
            scanner.nextLine(); 
            if (taskChoice == 1 || taskChoice == 2) {
                validInput = true;
            }
        } else {
            scanner.nextLine(); 
        }

        if (!validInput) {
            System.out.println("Nieprawidłowe dane wejściowe dla wyboru zadania. Proszę uruchomić program ponownie i wprowadzić 1 lub 2.");
            scanner.close();
            return;
        }

        if (taskChoice == 1) {
            System.out.println("\n--- Uruchamianie Zadania 1 ---");
            task1(scanner);
        } else if (taskChoice == 2) {
            System.out.println("\n--- Uruchamianie Zadania 2 ---");
            task2(scanner);
        }
        
        scanner.close(); 
    }
}