import java.util.Arrays;
import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        int length = getLength();
        int[] fibonachiNumbers = getFibonachiNumbers(length);
        int[] cubes = getCubes(length);
        printCommonNumbers(fibonachiNumbers, cubes);
    }

    private static int getLength() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter n (first numbers you want to see): ");
        int length = scanner.nextInt();
        return length;
    }

    private static int[] getFibonachiNumbers(int length) {
        int[] fibonachiNumbers = new int[length];
        fibonachiNumbers[0] = 0;
        fibonachiNumbers[1] = 1;
        for (int i = 2; i < fibonachiNumbers.length; ++i) {
            fibonachiNumbers[i] = fibonachiNumbers[i - 1] + fibonachiNumbers[i - 2];
        }
        System.out.print("Fibonachi: ");
        System.out.println(Arrays.toString(fibonachiNumbers));
        return fibonachiNumbers;
    }

    private static int[] getCubes(int length) {
        System.out.print("Cubes: ");
        int[] cubes = new int[length];

        for (int i = 0; i < cubes.length; i++) {
            int cube = (int) Math.pow(i, 3);
            cubes[i] = cube - 1;
        }
        System.out.println(Arrays.toString(cubes));
        return cubes;
    }

    private static void printCommonNumbers(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++){
            for (int j = 0; j < arr2.length; j++){
                if (arr1[i] == arr2[j])
                    System.out.println("Common numbers: " + arr1[i]);
            }
        }
    }

}
