import java.util.*;

public class MethodOverLoadingandOverRiding {
    public static void main(String[] args) {
        // calculator obj = new calculator();
        // System.out.println(obj.sum(5.5f, 6.5f));
        // System.out.println(obj.sum(5, 6));
        // System.out.println(obj.sum(9, 6, 10));

        Deer objDeer = new Deer();
        objDeer.eat();
    }
}

class Animal {
    void eat() {
        System.out.println("Eats Every Thing...");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eats Grass...");
    }
}

class calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}
