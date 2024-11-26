package src.main.mooc.part12.magicsquare;

public class Main {
    public static void main(String[] args) {
        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3));
    }
}
