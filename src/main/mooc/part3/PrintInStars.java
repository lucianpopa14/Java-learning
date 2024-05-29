package src.main.mooc.part3;

public class PrintInStars {
    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printArrayInStars(array);
    }

    public static void printArrayInStars(int[] array) {
        for (int number : array) {
            int counter = 0;
            while (true) {
                System.out.print('*');
                counter++;
                if(counter==number) {
                    System.out.println();
                    break;
                }
            }
        }
    }
}
