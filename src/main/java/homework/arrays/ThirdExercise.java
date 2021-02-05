package homework.arrays;

public class ThirdExercise {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int odds = 0;
        int unodds = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                odds += arr[i];
            } else
                unodds += arr[i];

        }
        System.out.println("Сума четни: " + odds);
        System.out.println("Сума нечетни: " + unodds);
    }
}
