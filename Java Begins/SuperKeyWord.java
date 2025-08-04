import java.util.*;

public class SuperKeyWord {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.color);
    }
}

class Animal {
    String color;

    Animal() {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal {
    Horse() {
        // super();
        super.color = "BlacK";
        System.out.println("Horse constructor is called");
    }
}
