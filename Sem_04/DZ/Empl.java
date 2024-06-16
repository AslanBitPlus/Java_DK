package DZ;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empl {
    List<Sotr> list;

    public Empl() {
        list = new ArrayList<>();
    }

    // Добавление сотрудника в каталог
    public void addSotr(Sotr sotr) {
        list.add(sotr);
    }


    // Поиск сотрудника по таб.номеру
    public Sotr findSotrByTabnum(int tn){
        for (Sotr sotr : list) {
            if (sotr.getTabnum() == tn) {
                // System.out.println(sotr.toString());
                return sotr;
            }
        }
        return null;
    }

    public void findSotrByName (String name) {
        System.out.println("Номе телефона сотрудника " + name);
        int n = 0;
        for (Sotr sotr : list) {
            if (Objects.equals(sotr.getName(), name)) {
                n++;
                System.out.println(n + ". " + sotr.getName() + " -> " + sotr.getPhone());
            }
        }
        if (n == 0) System.out.println("Нет сотрудников по имени " + name);
    }

    // Поиск сотрудника по стажу
    public void findSotrBySt(int st){
        System.out.println("Поиск сотрудников у которых стаж = " + st);
        for (Sotr sotr : list) {
            if (sotr.getSt() == st) {
                System.out.println(sotr.toString());
            }
        }
    }


}
