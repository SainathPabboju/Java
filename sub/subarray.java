package sub;

import java.util.Scanner;

public class subarray {

    public static void printallsubarray(int[] arr, int s, int e) {
        for (int i = s; i < e; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = sc.nextInt();
        }
        for (int s = 0; s < n; s++) {
            for (int e = s; e < n; e++) {
                printallsubarray(arr, s, e);
            }
        }
        sc.close();
    }

}