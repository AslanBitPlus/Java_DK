package S3;
/*
Задание 3
В рамках выполнения задачи необходимо:
● Создайте телефонный справочник с помощью Map - телефон это ключ, а имя
значение
● Найдите человека с самым маленьким номером телефона
● Найдите номер телефона человека чье имя самое большое в алфавитном порядке
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 4.2");

        HashMap<String, String> phoneBook = new HashMap<>();

        phoneBook.put("123", "Ivanov");
        phoneBook.put("456", "Petrovich");
        phoneBook.put("789", "Sidorov");

        System.out.println(phoneBook);
        // 1 метод
        System.out.println("MinNumber " + getLittleNumber(phoneBook));
        // 2 метод
        System.out.println(phoneBook.entrySet()
                .stream().min(Comparator.comparingInt(e -> Integer.parseInt(e.getKey())))
                .get()
                .getValue());

        System.out.println(phoneBook.entrySet()
                .stream().max((e1, e2) -> e1.getValue().compareTo(e2.getValue()))
                .get()
                .getKey());


    }

    public static int getLittleNumber (HashMap<String, String> map) {
        Set<String> set = map.keySet();

        Integer[] objects = new Integer[set.size()];
        int i = 0;
        for (String object : set) {
            objects[i++] = Integer.parseInt(object);
        }

        List<Integer> list = Arrays.asList(objects);
        return Collections.min(list);
    }


}
