package geekbrains.homework6.online;

public class Dog extends Animal {
    Dog(String name) {
        super(name);
        this.maxRun = random.nextInt(100) + 500;
        this.maxJump = 0.5;
        this.maxSwim = 10;
    }
}
