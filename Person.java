public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private int birthYear; 
    
    public Person(String firstName, String lastName, int age, int birthYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthYear = birthYear;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public int getBirthYear() {
        return birthYear;
    }
    
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
    public void growOld(int years) {
        age += years;
        System.out.println(firstName + " " + lastName + " postarzał(a) się o " + years + " lat.");
    }
    
    public void decreaseAge(int years) {
        age -= years;
        System.out.println(firstName + " " + lastName + " odmłodniał(a) o " + years + " lat.");
    }
    
    public void displayInfo() {
        System.out.println("Osoba: " + firstName + " " + lastName);
        System.out.println("Wiek: " + age + " lat");
        System.out.println("Rok urodzenia: " + birthYear);
        System.out.println();
    }
}