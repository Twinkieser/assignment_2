import java.util.ArrayList;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        
        Employee e1 = new Employee("John", "Lennon", "Singer", 27045.78);
        Employee e2 = new Employee("George", "Harrison", "Guitarist", 50000.00);
        Student s1 = new Student("Ringo", "Starr", 2.5);
        Student s2 = new Student("Paul", "McCartney", 3.8);

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(e1);
        people.add(e2);
        people.add(s1);
        people.add(s2);

        Collections.sort(people);

        printData(people);
    }

    public static void printData(Iterable<Person> iterable) {
        for (Person p : iterable) {
            System.out.println(p + " earns " + p.getPaymentAmount() + " tenge");
        }
    }
}
