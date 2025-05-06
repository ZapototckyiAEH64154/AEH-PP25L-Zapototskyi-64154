import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class mojaDataAplikacja {
    public static void main(String[] args) {
        demonstracjaMetodFormatowania();
        drukujZnak('*', 5, 3);
    }
    
    public static void demonstracjaMetodFormatowania() {
        LocalDate dzisiaj = LocalDate.now();
        System.out.println("Różne formaty daty:");
        wyswietlDate(dzisiaj, "Podstawowy", DateTimeFormatter.ISO_LOCAL_DATE);
        wyswietlDate(dzisiaj, "Pełna nazwa miesiąca", DateTimeFormatter.ofPattern("dd MMMM yyyy"));
    }
    
    public static void wyswietlDate(LocalDate data, String nazwa, DateTimeFormatter formatter) {
        System.out.println(nazwa + ": " + data.format(formatter));
    }
    
    public static void drukujZnak(char znak, int ileRazy, int ileLini) {
        System.out.println("\nWynik działania metody drukujZnak:");
        for (int i = 0; i < ileLini; i++) {
            for (int j = 0; j < ileRazy; j++) {
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}