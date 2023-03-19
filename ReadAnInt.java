import java.util.Scanner;

public class ReadAnInt {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(input.nextInt());
        }

    }
}