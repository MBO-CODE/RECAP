import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {


        String testName = "helloWorld";
            System.out.println(testName);

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("1");
        stringArrayList.add("2");
        stringArrayList.add("3");
        stringArrayList.add("4");
        stringArrayList.add("5");
        stringArrayList.add("6");

        System.out.println(stringArrayList);

        System.out.println("HelloDarkestMyOldFriend");

        System.out.println("created new branch");


        Animal animal = new Cat();
        Animal.walk();
        System.out.println(animal.n);

        System.out.println(10 * 20 + "Javatpoint");
        System.out.println("Javatpoint" + 10 * 20);
        System.out.println("Javatpoint" + 10 + 20);
    }
}