package S1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private static  List<String> createListNames() {
        List<String> list = new ArrayList<>();
        list.add("Костя");
        list.add("Василий");
        list.add("Семен");
        list.add("Кирилл");
        list.add("Сергей");

        return list;
    }

    public static void main(String[] args) {
        System.out.println("Задание 4.1");

        List<String> names = createListNames();
        System.out.println(names);
        System.out.println("Сортировка по алфавиту " + sortByAlphabet(names));
        System.out.println("Сортировка по кол.символов " + sortByLengthLine(names));
        System.out.println("Сортировка в обр.порядке " + reverseList(names));
    }

    private static List<String> sortByAlphabet(List<String> list) {
        // Первый способ
        // Collections.sort(list);
        // return list;

        // Второй способ
        return list.stream().sorted().toList();

    };

    private static List<String> sortByLengthLine(List<String> list) {
        List<String> result = new ArrayList<>(list);
        // Способ 1
        result.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(), o2.length());
            }
        });
        // Способ 2
        // return o1.length() - o2.length();
        // Способ 3
        // result.sort(Comparator.comparingInt(String::length));
        // Способ 4
        // result.sort((o1, o2) -> o1.length() - o2.length());
        return result;
        // С помощью  Stream
        // return list.stream().sorted((o1, o2) -> o1.length() - o2.length()).toList();

    };

    private static List<String> reverseList(List<String> list) {
        // Способ 1
        List<String> result = new ArrayList<>(list);
        Collections.reverse(result);
        return result;
        // Способ 2 ???
        // return list.stream().sorted(Comparator.reverseOrder()).toList();
    };
}
