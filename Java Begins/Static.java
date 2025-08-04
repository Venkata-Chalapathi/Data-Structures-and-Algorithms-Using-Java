import java.util.*;

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName = "LSS";
        Student s2 = new Student();
        System.out.println(s1.schoolName);
    }
}

class Student {
    String name;
    int rollNum;

    int calcPercentage(int phy, int math){
        return (phy + math) / 2;
    }

    static String schoolName;

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
