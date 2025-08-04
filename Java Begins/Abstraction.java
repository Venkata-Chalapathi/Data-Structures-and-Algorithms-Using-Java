import java.util.*;

public class Abstraction {
    public static void main(String[] args) {
        // Fish objFish = new Fish();
        // objFish.eat();
        // objFish.Swim();
        // objFish.changeColor();
        // System.out.println(objFish.color);

        Fishbreed objFishbreed = new Fishbreed();

        // Dolphin objDolphin = new Dolphin();
        // objDolphin.eat();
        // objDolphin.Swim();
    }
}

abstract class Animal {
    String color;

    Animal() {
        // color = "Black";
        System.out.println("Animal Constructor");
    }

    void eat() {
        System.out.println("Animal Eats..");
    }

    abstract void Swim();
}

class Fish extends Animal {
    Fish() {
        System.out.println("Fish Constructor..");
    }

    void changeColor() {
        color = "Black and White";
    }

    void Swim() {
        System.out.println("Swims..");
    }
}

class Fishbreed extends Fish {
    Fishbreed() {
        System.out.println("Fishbreed Constructor");
    }
}

class Dolphin extends Animal {
    void changeColor() {
        color = "Blueeee....";
    }

    void Swim() {
        System.out.println("Swims Slower..");
    }
}
