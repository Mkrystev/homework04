package homework.arrays;

import java.util.Scanner;

public class FifthExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n ; i++) {
            if (i % (3 * 7) != 0)
                System.out.println(i);

        }
    }
}
