import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class App {
    private List<Human> people;

    public App() {
        people = new ArrayList<>();
        people.add(new Human(19, "Карл", "Романов", LocalDate.of(2001, 7, 28), 151));
        people.add(new Human(28, "Иван", "Петренко", LocalDate.of(1992, 1, 20), 70));
        people.add(new Human(20, "Андрей", "Иванов", LocalDate.of(2000, 5, 1), 81));
        people.add(new Human(17, "Сергей", "Петров", LocalDate.of(2003, 3, 5), 64));
        people.add(new Human(15, "Алексей", "Макарошкин", LocalDate.of(2005, 10, 25), 62));

        reversedSortByWeight();
        System.out.print('\n');

        filtrationNotIvanov();
        System.out.print('\n');

        sortByAge();
        System.out.print('\n');

        System.out.println(ageMultiplication());
    }

    private void reversedSortByWeight(){
        Stream<Human> stream = people.stream();
        stream.sorted(Comparator.comparing(Human::getWeight).reversed()).forEach(System.out::println);
    }

    private void filtrationNotIvanov(){
        Stream<Human> stream = people.stream();
        stream.filter(person -> !person.getLastName().equals("Иванов")).forEach(System.out::println);
    }

    private void sortByAge(){
        Stream<Human> stream = people.stream();
        stream.sorted(Comparator.comparingInt(Human::getAge)).forEach(System.out::println);
    }

    private int ageMultiplication(){
        return people.stream().map(Human::getAge).reduce((a, b) -> a * b).orElseThrow(NullPointerException::new);
    }
}