package homework.arrays;

import java.util.Scanner;

public class SixthExercise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 1) {
            System.out.println(0);
        } else {
            int[] fibo = new int[n];

            fibo[0] = 0;
            fibo[1] = 1;

            int sum = fibo[0] + fibo[1];

            for (int i = 2; i < n; i++) {
                fibo[i] = fibo[i - 1] + fibo[i - 2];
                sum += fibo[i];
            }
            System.out.println(sum);
        }

    }
}