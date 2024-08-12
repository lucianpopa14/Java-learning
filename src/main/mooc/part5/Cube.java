package src.main.mooc.part5;

public class Cube {
    private int length;

    public Cube(int edgeLength) {
        this.length = edgeLength;
    }

    public int volume() {
        return length * length * length;
    }

    @Override
    public String toString() {
        return "The length of the edge is " + length + " and the volume " + volume();
    }

    public static void main(String[] args) {
        Cube cube = new Cube(4);
        System.out.println(cube);
    }
}
