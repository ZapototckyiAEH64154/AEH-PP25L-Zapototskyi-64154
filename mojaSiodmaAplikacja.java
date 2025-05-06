public class mojaSiodmaAplikacja {
    public static void main(String[] args) {
        Person osoba1 = new Person("Jan", "Kowalski", 25, 1999);
        Person osoba2 = new Person("Anna", "Nowak", 30, 1994);
        
        System.out.println("Dane przed modyfikacjami:");
        osoba1.displayInfo();
        osoba2.displayInfo();
        
        osoba1.growOld(10); 
        osoba2.growOld(5);  
        
        System.out.println("\nDane po zwiększeniu wieku:");
        osoba1.displayInfo();
        osoba2.displayInfo();
        
        osoba1.decreaseAge(3);
        osoba2.decreaseAge(2);
        
        System.out.println("\nDane po zmniejszeniu wieku:");
        osoba1.displayInfo();
        osoba2.displayInfo();
    }
}