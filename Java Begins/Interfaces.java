import java.util.*;

public class Interfaces {
    public static void main(String[] args) {
        Queen objQueen = new Queen();
        objQueen.move();
    }
}

interface chessPlayer {
    void move();
}

class Queen implements chessPlayer {
    public void move() {
        System.out.println("up down left right diagonal");
    }
}

class Rook implements chessPlayer {
    public void move() {
        System.out.println("up down left right");
    }
}

class King implements chessPlayer {
    public void move() {
        System.out.println("up down left right diagonal by 1 step");
    }
}
