public class Main {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Orange orange = new Orange();
        System.out.println("Apple weight: " + apple.getWeight());
        System.out.println("Orange weight: " + orange.getWeight());

        Box<Apple> appleBox = new Box<Apple>(apple,12);
        System.out.println("Weight after: " + appleBox.getWeight() + " apple");
        Box<Orange> orangeBox = new Box<Orange>(orange,8);
        System.out.println("Weight after: " + orangeBox.getWeight() + " orange");

        System.out.println();
        System.out.println(orangeBox.compare(appleBox));

    }
}
