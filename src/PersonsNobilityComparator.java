import java.util.Comparator;

public class PersonsNobilityComparator implements Comparator<Person> {
    protected int maxSymbols;

    public PersonsNobilityComparator(int maxSymbols) {
        this.maxSymbols = maxSymbols;
    }

    @Override
    public int compare(Person o1, Person o2) {
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
    }
}