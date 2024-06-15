package S1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Семинар_03");
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox2 = new Box<>();
        Box<Apple> appleBox = new Box<>();
        Box<Fruit> fruitBox = new Box<>();

        orangeBox.add(new Orange());
        orangeBox.add(new Orange());

        orangeBox2.add(new Orange());
        orangeBox2.add(new Orange());

        appleBox.add(new Apple());
        appleBox.add(new Apple());
        appleBox.add(new Apple());
        // appleBox.add(new Orange()); // невозмлжно добавить в коробку яюлок апельсин

        fruitBox.add(new Apple());
        fruitBox.add(new Orange());

        System.out.println(appleBox.compare(orangeBox));

        orangeBox.transferTo(orangeBox);
    }
}
