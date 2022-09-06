package Laptrinhtongquat;

import java.util.ArrayList;
import java.util.List;

public class Week11 {
    /**
     * sort list.
     *
     * @param list list.
     * @param <T>  int, String, Person.
     * @return list sort.
     */
    public static <T> List<T> sortGeneric(List<T> list) {
        list.sort((x, y) -> {
            if (x instanceof String) {
                return ((String) x).compareTo((String) y);
            }
            if (x instanceof Person) {
                return ((Person) x).compareTo((Person) y);
            }
            if (x instanceof Integer) {
                return ((Integer) x).compareTo((Integer) y);
            }
            return 0;
        });
        return list;
    }

    /**
     * main.
     *
     * @param args .
     */
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Nguyen A", 22, "A"));
        list.add(new Person("Nguyen A", 20, "B"));
        list.add(new Person("Le B", 20, "C"));
        list = sortGeneric(list);
        for (Person person : list) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
