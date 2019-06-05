import java.util.Scanner;

public class ReverseElementInArray {
    public static void main(String[] args) {
        // Khai bao bien
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);

        // Nhap va kiem tra kich thuoc mang
        do {
            System.out.println("Enter a size:");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);

        // Nhap gia tri cho cac phan tu mang
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element " + (i+1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }

        // In ra mang da nhap
        System.out.printf("%-20s%s", "Element in array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }

        // Dao nguoc thu tu cac phan tu trong mang
        for (int j = 0; j < array.length/2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        // In ra mang sau khi Dao nguoc
        System.out.printf("Reverse array: " + "\n");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
    }
}
