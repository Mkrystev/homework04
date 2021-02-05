package homework.arrays;

import java.util.Scanner;

public class FifthExercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;

        while (i <= n) {
            if (i % (3 * 7) != 0)
                System.out.println(i);
            i++;

        }
    }
}
