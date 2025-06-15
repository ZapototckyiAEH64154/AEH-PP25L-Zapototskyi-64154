import java.io.*;
import java.nio.file.*;
import java.util.*;

public class mojaTrzynastaAplikacja {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath = "";
        Path inputFile;
        
        do {
            System.out.print("Podaj sciezke do pliku wejsciowego: ");
            inputPath = scanner.nextLine();
            inputFile = Paths.get(inputPath);
            if (!Files.exists(inputFile)) {
                System.out.println("Plik nie istnieje. Sprobuj ponownie.");
            }
        } while (!Files.exists(inputFile));
        
        System.out.print("Podaj sciezke do pliku wyjsciowego: ");
        String outputPath = scanner.nextLine();

        Map<String, Integer> wordCount = new HashMap<>();
        int totalWords = 0;

        try (BufferedReader reader = Files.newBufferedReader(inputFile)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\W+"); 
                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.toLowerCase();
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                        totalWords++;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Blad czytania pliku: " + e.getMessage());
            return;
        }

        System.out.println("Liczba slow w pliku: " + totalWords);
        System.out.println("Wystapienia slow:");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(outputPath))) {
            writer.write("Plik: " + inputPath + "\n");
            writer.write("Liczba slow: " + totalWords + "\n");
            writer.write("Wystapienia slow:\n");
            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Blad zapisu do pliku: " + e.getMessage());
        }
    }
}
