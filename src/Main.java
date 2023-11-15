import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //task-1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array's size:");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

        for (int i = size - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }

        //task-2
        Scanner scanner2 = new Scanner(System.in);
        int size2 = scanner2.nextInt();

        Random random = new Random();
        int[] array2 = new int[size2];

        for (int i = 0; i < size2; i++) {
            array2[i] = random.nextInt(10, 100);
            System.out.println(array2[i]);
        }

        int min = Integer.MAX_VALUE;
        for (int temp : array) {
            if(min > temp) {
                min = temp;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int temp : array) {
            if(max < temp) {
                max = temp;
            }
        }

        System.out.println("The minimum value is: " + min);
        System.out.println("The maximum value is: " + max);

        //task-3
        Scanner scanner3 = new Scanner(System.in);
        int size3 = scanner3.nextInt();

        Random random3 = new Random();
        int[] array3 = new int[size3];

        for (int i = 0; i < size3; i++) {
            array3[i] = random3.nextInt(10, 100);
            System.out.println(array3[i]);
        }

        int maxIndex = 0;

        int minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array3[i] > array3[maxIndex])
            {
                maxIndex = i;
            }
            else if (array3[i] < array3[minIndex])
            {
                minIndex = i;
            }
        }

        System.out.println("Index of maximal number is: " + maxIndex);
        System.out.println("Index of minimal number is: " + minIndex);

        //task-4
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("Enter array's size:");
        int size4 = scanner4.nextInt();

        int[] array4 = new int[size];

        System.out.println("Enter the numbers:");

        int nullValue = 0;

        for (int i = 0; i < size4; i++) {
            array4[i] = scanner4.nextInt();
            if(array4[i] == 0) {
                nullValue++;
            }
        }

        System.out.println(Arrays.toString(array4));

        if(nullValue != 0) {
            System.out.println("Value of null elements is: " + nullValue);
        } else {
            System.out.println("No null elements found.");
        }

        //task-5
        Scanner scanner5 = new Scanner(System.in);
        int size5 = scanner5.nextInt();

        Random random5 = new Random();
        int[] array5 = new int[size5];

        for (int i = 0; i < size5; i++) {
            array5[i] = random5.nextInt(10, 100);
        }

        System.out.println(Arrays.toString(array5));

        for (int i = 0; i < size5 / 2; i++) {
            int temp = array[i];
            array5[i] = array5[size5 - i - 1];
            array5[size5 - i - 1] = temp;
        }

        System.out.println(Arrays.toString(array5));

        //task-6
        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Enter array's size:");
        int size6 = scanner6.nextInt();

        int[] array6 = new int[size6];

        System.out.println("Enter the numbers:");

        for (int i = 0; i < size6; i++) {
            array6[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array6));

        boolean flag = true;

        for (int i = 1; i < size6; i++) {
            if (array6[i] <= array6[i - 1]) {
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("The array is an incremental sequence.");
        } else {
            System.out.println("The array isn't an incremental sequence.");
        }

        //task-star
        Scanner scanner7 = new Scanner(System.in);
        int size7 = scanner7.nextInt();

        Random random7 = new Random();
        int[] array7 = new int[size7];

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < size7; i++) {
            array7[i] = random7.nextInt(1, 9);
            System.out.println(array7[i]);
            stringBuilder.append(array7[i]);
        }

        String str = stringBuilder.toString();
        System.out.println(str);

        int number = Integer.parseInt(str);
        number += 1;

        System.out.println(number);

        String numberString = Integer.toString(number);
        char[] charArray = numberString.toCharArray();

        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Character.getNumericValue(charArray[i]);
        }

        System.out.println(Arrays.toString(intArray));
    }
}