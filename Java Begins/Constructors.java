import java.util.*;

public class Constructors {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Chalapathi";
        s1.roll = 19221150;
        s1.passWord = "pol";
        s1.marks[0] = 100;
        s1.marks[1] = 98;
        s1.marks[2] = 92;

        Student s2 = new Student(s1);
        s2.passWord = "ven";
        s1.marks[2] = 100;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
        // Student s2 = new Student("Chalapathi");
        // System.out.println(s2.name);
        // Student s3 = new Student(192211150);
        // System.out.println(s3.roll);

    }
}

class Student {
    String name;
    int roll;
    String passWord;
    int marks[];

    // SHALLOW COPY CONSTRUCTOR
    // Student(Student s1) {
    // marks = new int[3];
    // this.name = s1.name;
    // this.roll = s1.roll;
    // this.marks = s1.marks;
    // }

    // DEEP COPY CONSTRUCTOR

    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }

    }

    Student() {
        marks = new int[3];
        System.out.println("Constructor is called....");
    }

    Student(String name) {
        marks = new int[3];
        this.name = name;
    }

    Student(int roll) {
        marks = new int[3];
        this.roll = roll;
    }
}
