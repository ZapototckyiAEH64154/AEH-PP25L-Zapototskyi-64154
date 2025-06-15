import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class mojaDwunastaAplikacja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Path inputPath;
        while (true) {
            System.out.print("Podaj ścieżkę do pliku wejściowego: ");
            String inputFilePath = scanner.nextLine();
            inputPath = Paths.get(inputFilePath);

            if (Files.exists(inputPath) && Files.isRegularFile(inputPath)) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Spróbuj ponownie.");
            }
        }

        System.out.print("Podaj ścieżkę do pliku wyjściowego: ");
        String outputFilePath = scanner.nextLine();
        Path outputPath = Paths.get(outputFilePath);

        int lineCount = 0;

        try (BufferedReader reader = Files.newBufferedReader(inputPath)) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Liczba linii w pliku: " + lineCount);

            try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
                writer.write("Plik: " + inputPath.getFileName());
                writer.newLine();
                writer.write("Liczba linii: " + lineCount);
            }

            System.out.println("Wynik zapisano do pliku: " + outputFilePath);

        } catch (IOException e) {
            System.out.println("Wystąpił błąd podczas odczytu/zapisu pliku: " + e.getMessage());
        }
    }
}
