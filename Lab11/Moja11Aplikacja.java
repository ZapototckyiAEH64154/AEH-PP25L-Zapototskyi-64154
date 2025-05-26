import java.util.*;

public class Moja11Aplikacja {
    private String numerIndeksu;
    private String imie;
    private String nazwisko;
    private List<Integer> oceny;
    
    public Moja11Aplikacja(String numerIndeksu, String imie, String nazwisko, List<Integer> oceny) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>(oceny);
    }
    
    public String getNumerIndeksu() {
        return numerIndeksu;
    }
    
    public String getImie() {
        return imie;
    }
    
    public String getNazwisko() {
        return nazwisko;
    }
    
    public List<Integer> getOceny() {
        return new ArrayList<>(oceny);
    }
    
    public double obliczSredniaOcen() {
        if (oceny.isEmpty()) {
            return 0.0;
        }
        
        double suma = 0;
        for (Integer ocena : oceny) {
            suma += ocena;
        }
        return suma / oceny.size();
    }
    
    @Override
    public String toString() {
        return String.format("%s %s (%s) - Average: %.2f", 
                           imie, nazwisko, numerIndeksu, obliczSredniaOcen());
    }
    
    public static void main(String[] args) {
        List<Moja11Aplikacja> students = Arrays.asList(
            new Moja11Aplikacja("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
            new Moja11Aplikacja("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
            new Moja11Aplikacja("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
            new Moja11Aplikacja("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );
        
        System.out.println("Lista studentów:");
        for (Moja11Aplikacja student : students) {
            System.out.println(student);
        }
        
        Moja11Aplikacja najlepszyStudent = students.get(0);
        for (Moja11Aplikacja student : students) {
            if (student.obliczSredniaOcen() > najlepszyStudent.obliczSredniaOcen()) {
                najlepszyStudent = student;
            }
        }
        
        System.out.println("\nStudent z najwyższą średnią: " + najlepszyStudent);
        
        List<Moja11Aplikacja> posortowaniStudenci = new ArrayList<>(students);
        posortowaniStudenci.sort((s1, s2) -> s1.getNazwisko().compareTo(s2.getNazwisko()));
        
        System.out.println("\nStudenci posortowani według nazwisk:");
        for (Moja11Aplikacja student : posortowaniStudenci) {
            System.out.println(student);
        }
    }
}