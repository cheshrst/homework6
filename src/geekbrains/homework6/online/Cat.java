package geekbrains.homework6.online;

public class Cat extends Animal {
    Cat(String name) {
        super(name);
        this.maxJump = 2;
        this.maxRun = random.nextInt(45) + 200;
    }

    @Override
    void swim(int dist){
        System.out.println("Кошки не умеют плавать");
    }
}
