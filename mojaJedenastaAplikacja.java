import java.util.*;

public class mojaJedenastaAplikacja {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
            new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
            new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
            new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        Student topStudent = Collections.max(students, Comparator.comparingDouble(Student::calculateAverage));
        System.out.printf("Student z najwyższą średnią: %s %s (%s) - Average: %.2f\n",
                topStudent.getFirstName(), topStudent.getLastName(), topStudent.getIndexNumber(),
                topStudent.calculateAverage());

        System.out.println("Studenci posortowani według nazwisk:");
        students.stream()
                .sorted(Comparator.comparing(Student::getLastName))
                .forEach(s -> System.out.printf("%s %s (%s) - Average: %.2f\n",
                        s.getFirstName(), s.getLastName(), s.getIndexNumber(), s.calculateAverage()));
    }
}
