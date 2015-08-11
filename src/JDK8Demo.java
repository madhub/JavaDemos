import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/**
 * Created by bs_ma on 11-08-2015.
 */
public class JDK8Demo {

    public static class Employee {
        private String firstName;
        private String lastName;
        private LocalDate birthDate;
        private int age;

        public Employee(String firstName, String lastName, LocalDate birthDate) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.birthDate = birthDate;
            // calcl
            LocalDate today = LocalDate.now();
            Period period = Period.between(birthDate,today);
            age = period.getYears();

        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public LocalDate getBirthDate() {
            return birthDate;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", birthDate=" + birthDate +
                    ", age=" + age +
                    '}';
        }
    }
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Chandler", "Bing", LocalDate.of(1971, 06, 21)),
                new Employee("Ross", "Geller", LocalDate.of(1975, 10, 05)),
                new Employee("Monika", "Geller", LocalDate.of(1980, 1, 06)),
                new Employee("Rachel", "Green", LocalDate.of(1981, 04, 10)),
                new Employee("Elmer", "Fudd", LocalDate.of(1981, 11, 11)));

        employees.sort(Comparator.comparing(Employee::getFirstName));


        
//        // method forEach defined on Iterable , so it is available on all collection classes
//        List<String> strings =     Arrays.asList("one", "two", "three") ;
//        strings.forEach(System.out::println) ;
//
//        {
//            Collection<String> numberStrings = Arrays.asList("one", "two", "three", "four");
//            // works « in place », no Collections.unmodifiable...
//            Collection<String> list = new ArrayList<>(numberStrings);
//            // returns true if the list has been modified
//            boolean b = list.removeIf(s -> s.length() > 4);
//        }
//
//        // or returns nothing
//        {
//            // Sorts a List in place, takes a Comparator
//            Collection<String> numberStrings =     Arrays.asList("one", "two", "three", "four");
//            // works « in place », no Collections.unmodifiable...
//            List<String> list = new ArrayList<>(strings);
//            // returns true if the list has been modified
//            list.sort(Comparator.naturalOrder());
//        }


    }
}
