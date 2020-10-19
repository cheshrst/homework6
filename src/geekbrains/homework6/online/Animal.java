package geekbrains.homework6.online;

import java.util.Random;

public abstract class Animal {
    String name;
    double maxJump;
    int maxRun;
    int maxSwim;
    public Random random = new Random();
        public Animal(String name ) {
        this.name = name;
    }
    void jump(double height){
            if(height < this.maxJump) {
                System.out.println(this.name + " подпрыгнул");
            }else{System.out.println(this.name + "Не допрыгнул");
        }
    }
    void run(int dist){
            if(dist < this.maxRun) {
                System.out.println(this.name + " побежал");
            }else {System.out.println(this.name + " не добежал");

            }
    }
    void swim(int dist){
            if(dist < this.maxSwim) {
                System.out.println(this.name + " поплыл");
            }else {
            System.out.println(this.name + " не доплыл");
            }
    }

}
