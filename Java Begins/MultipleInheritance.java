import java.util.*;

public class MultipleInheritance {
    public static void main(String[] args) {
        child c = new child();
        c.property();
    }
}

interface Mother {
    void property();
}

interface Father {
    void property();
}

class child implements Mother, Father {
    public void property() {
        System.out.println("Property is Mine");
    }
}
