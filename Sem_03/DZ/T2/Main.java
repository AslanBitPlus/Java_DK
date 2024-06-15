package DZ.T2;

/*
Напишите обобщенный метод compareArrays(), который принимает
два массива и возвращает true, если они одинаковые,
и false в противном случае. Массивы могут быть любого типа данных,
но должны иметь одинаковую длину и содержать элементы
одного типа по парно по индексам.
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 3.2");

        String[] arr1 = {"A", "B", "C", "D", "E"};
        String[] arr2 = {"A", "B", "C", "D", "E"};
        String[] arr3 = {"A", "B", "C", "E", "D"};
        String[] arr4 = {"A", "B", "C"};

        System.out.println("arr1 - " + Arrays.toString(arr1));
        System.out.println("arr2 - " + Arrays.toString(arr2));
        System.out.println("arr3 - " + Arrays.toString(arr3));
        System.out.println("arr4 - " + Arrays.toString(arr4));

        System.out.println("?(arr1 = arr2) -> " + compareArrays(arr1, arr2));
        System.out.println("?(arr1 = arr3) -> " + compareArrays(arr1, arr3));
        System.out.println("?(arr2 = arr4? -> " + compareArrays(arr2, arr4));


    }

    public static <T> boolean compareArrays(T[] arr1, T[] arr2) {
        // Разное количество элементов в массивах
        if (arr1.length != arr2.length) {
            return false;
        }
        // Равенство попарно
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }

        return true;
    }

}
