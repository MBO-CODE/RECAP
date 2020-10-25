public class Animal {

    String color;
    int n;
    Animal(String color) {
        this.color = color;
    }

    Animal () {
        this("black") ;
    }

    public static void walk() {
        System.out.println("Animal walks");
    }

    Object object;
}
