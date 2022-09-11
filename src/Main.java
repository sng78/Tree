import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int maxSymbols = 8;

        List<Person> person = new ArrayList<>();
        person.add(new Person("Vasilij", "Vasiliev", 8));
        person.add(new Person("Petr", "Petrov", 8));
        person.add(new Person("Sergei", "Sergeev", 18));
        person.add(new Person("Victor", "Victorov", 10));

        Comparator<Person> comparator = (p1, p2) -> {
            if ((p1.surname.length() > maxSymbols) && (p2.surname.length() > maxSymbols)) {
                return p1.age - p2.age;
            } else {
                if (p1.surname.length() > p2.surname.length()) {
                    return 1;
                } else if (p1.surname.length() < p2.surname.length()) {
                    return -1;
                } else {
                    return p1.age - p2.age;
                }
            }
        };

        person.sort(comparator);
        System.out.println(person);
    }
}