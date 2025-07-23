import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");// задача 1
        int[] number = new int[]{1, 2, 3};
        double[] numbers = {1.57, 7.654, 9.986};
        boolean[] answers = {true, false, true};
        System.out.println("Задача 2");// задача 2
        for (int i = 0; i < number.length; i++) {
            if (i > 0) {
                System.out.print(", ");        }
            System.out.print(number[i]);        }
        System.out.println();
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < answers.length; i++) {
            System.out.print(answers[i]);
            if (i < answers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 3");// Задача 3
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = answers.length - 1; i >= 0; i--) {
            System.out.print(answers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        System.out.println("Задача 4");// Задача 4
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0) {
                number[i] += 1;
            }
        }
        System.out.println(Arrays.toString(number));
    }
}




