import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Vasilij", "Vasiliev", 8));
        person.add(new Person("Petr", "Petrov", 8));
        person.add(new Person("Sergei", "Sergeev", 18));
        person.add(new Person("Victor", "Victorov", 10));

        Collections.sort(person, new PersonsNobilityComparator(2));
        System.out.println(person);
        Collections.sort(person, new PersonsNobilityComparator(7));
        System.out.println(person);
        Collections.sort(person, new PersonsNobilityComparator(8));
        System.out.println(person);
    }
}