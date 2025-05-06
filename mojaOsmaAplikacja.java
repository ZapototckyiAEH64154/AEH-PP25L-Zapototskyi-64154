public class mojaOsmaAplikacja {
    public static void main(String[] args) {
        Konto konto1 = new Konto("123456789", "Jan Kowalski", "jan.kowalski@email.com", "123456789", 1000.0);
        
        System.out.println("Stan początkowy konta:");
        konto1.showInfo();
        
        System.out.println("\nWpłata 250.0 PLN:");
        konto1.deposit(250.0);
        
        System.out.println("\nWypłata 900.0 PLN:");
        konto1.withdraw(900.0);
        
        System.out.println("\nWypłata 500.0 PLN:");
        konto1.withdraw(500.0);
        
        System.out.println("\nWpłata 50.0 PLN:");
        konto1.deposit(50.0);
        
        System.out.println("\nStan końcowy konta:");
        konto1.showInfo();
    }
}