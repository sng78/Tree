import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static int maxSymbols;

    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Vasilij", "Vasiliev", 8));
        person.add(new Person("Petr", "Petrov", 8));
        person.add(new Person("Sergei", "Sergeev", 18));
        person.add(new Person("Victor", "Victorov", 10));

        maxSymbols = 8;
        Comparator<Person> comparator = (Person o1, Person o2) -> {
            if ((o1.surname.length() > maxSymbols) && (o2.surname.length() > maxSymbols)) {
                return o1.age - o2.age;
            } else {
                if (o1.surname.length() > o2.surname.length()) {
                    return 1;
                } else if (o1.surname.length() < o2.surname.length()) {
                    return -1;
                } else {
                    return o1.age - o2.age;
                }
            }
        };

        person.sort(comparator);
        System.out.println(person);
    }
}