import java.util.ArrayList;
import java.util.List;
//import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> person = new ArrayList<>();
        person.add(new Person("Vasilij", "Vasiliev", 8));
        person.add(new Person("Petr", "Petrov", 19));
        person.add(new Person("Sergei", "Sergeev", 18));
        person.add(new Person("Victor", "Victorov", 10));

        person.removeIf(p -> p.getAge() < 18);
        System.out.println(person);

        /*/
        Predicate<Person> condition = p -> p.getAge() < 18;
        person.removeIf(condition);
        System.out.println(person);
         */
    }
}