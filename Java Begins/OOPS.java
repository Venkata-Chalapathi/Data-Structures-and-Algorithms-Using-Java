import java.util.*;

public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColour("Pink");
        System.out.println(p1.getColour());
        p1.setTip(10);
        System.out.println(p1.getTip());

        // BankAccount myAcc = new BankAccount();
        // myAcc.userName = "G Venkata Chalapathi";
        // myAcc.setPassword("jhvjhv");

    }
}

// class BankAccount{
// public String userName;
// private String passWord;
// public void setPassword(String pwd){
// passWord = pwd;
// }
// }

class Pen {
    private String colour;
    private int tip;

    String getColour() {
        return this.colour;
    }

    int getTip() {
        return this.tip;
    }

    void setColour(String newColour) {
        this.colour = newColour;
    }

    void setTip(int tip) {
        this.tip = tip;
    }
}

// class Student {
// String name;
// int age;
// float percentage;

// void calcPercentage(int phy, int chem, int math) {
// percentage = (phy + chem + math) / 3;
// }
// }
