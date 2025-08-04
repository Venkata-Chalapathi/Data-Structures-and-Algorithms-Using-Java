import java.util.*;

public class PracT {

    static int totalSt = 0;

    public static void student() {
        // static int totalSt = 0;
    }

    PracT() {
        totalSt++;
    }

    public static void main(String[] args) {
        PracT obj = new PracT();
        PracT obj1 = new PracT();
        System.out.println(obj1.totalSt);
    }
}
