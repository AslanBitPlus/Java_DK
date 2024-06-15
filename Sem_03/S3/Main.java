package S3;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание - 3.2");

        CollectionEx<String> collection= new CollectionEx<>();
        collection.add("A");
        collection.add("B");
        collection.add("C");
        collection.add("D");
        collection.add("E");
        collection.add("F");

        System.out.println(collection.toString());

        collection.delete(3);

        System.out.println(collection.toString());

    }
}
