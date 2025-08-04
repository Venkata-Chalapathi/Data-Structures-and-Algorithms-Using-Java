import java.util.*;

public class Inheritance {
    public static void main(String[] args) {
        // Fish obj = new Fish();
        // obj.breathe();
        // Dog snoopy = new Dog();
        // snoopy.eats();
        // snoopy.legs = 4;
        // System.out.println(snoopy.legs);

        Eagle obj = new Eagle();
        obj.eats();
        obj.breathe();
        obj.fly();

    }
}

class Animal {
    String color;

    void eats() {
        System.out.println("Eating..");
    }

    void breathe() {
        System.out.println("Can Breathe..");
    }
}

// class Fish extends Animal {
// int fins;

// void swim() { // SINGLE INHERITANCE
// System.out.println("Can Swim");
// }
// }

// class Mammal extends Animal {
// String name;
// }

// class Dog extends Mammal {
// int legs;
// }

class Mammal extends Animal {
    void walk() {
        System.out.println("Walk");
    }
}

class Eagle extends Animal {
    void fly() {
        System.out.println("Fly");
    }
}

class Fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}
