package geekbrains.homework6.online;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Кот");
        Dog dog = new Dog("Собакен");
        System.out.println();
        dog.run(400);
        dog.swim(5);
        dog.jump(0.3);
        System.out.println();
        cat.run(246);
        cat.swim(5);
        cat.jump(1.7);
    }
}
