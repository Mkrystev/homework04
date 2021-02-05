package homework.arrays;

public class FirstExercise {
    public static void main(String[] args) {
        int[] myArray = new int[20];

        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i * 5;
            System.out.println("index " + i + " " + myArray[i]);
        }
    }
}
