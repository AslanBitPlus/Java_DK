package DZ;
/*
Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавления нового сотрудника в справочник

 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее Задание к Семинару 4");

        Empl empl = new Empl();
        Sotr sotr1 = new Sotr(1, "Ivan", "123", 1);
        Sotr sotr2 = new Sotr(2, "Vasiliy", "456", 2);
        Sotr sotr3 = new Sotr(3, "Petr", "789", 2);
        Sotr sotr4 = new Sotr(4, "Dimon", "120", 4);
        Sotr sotr5 = new Sotr(5, "Misha", "373", 1);
        Sotr sotr6 = new Sotr(6, "Petr", "321", 2);

        empl.addSotr(sotr1);
        empl.addSotr(sotr2);
        empl.addSotr(sotr3);
        empl.addSotr(sotr4);
        empl.addSotr(sotr5);
        empl.addSotr(sotr6);

        // Поиск сотрудников по стажу
        int staj = 2;
        empl.findSotrBySt(staj);

        // Номер телефона по имени сотрудника
        String name = "Petr";
        empl.findSotrByName(name);

        // Поиск по табельному номеру
        System.out.println(empl.findSotrByTabnum(3).toString());

    }
}
