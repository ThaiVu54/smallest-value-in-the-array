import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int m, n;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số dòng của mảng: ");
        m = sc.nextInt();
        System.out.print("nhập số cột của mảng: ");
        n = sc.nextInt();
        double[][] arr = new double[m][n];
        System.out.println("nhập các phần tử trong mảng: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                arr[i][j] = sc.nextInt();
            }
        }
        // todo in mảng
        System.out.println("Mảng vừa tạo là");
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + "\t");
            }
            System.out.println();
        }
        // double[][] newArr = new double[i][j];
        findMinElement(arr);
    }

    public static void findMinElement(double[][] arr) {
        double min = arr[0][0];
        int col;
        int row;
        for (row = 0; row < arr.length; row++) {
            for (col = 0; col < arr[row].length; col++) {
                if (min > arr[row][col]) {
                    min = arr[row][col];
                }
            }
        }
        System.out.println("Phần tử lớn nhất trong ma trận = " + min);
    }
}
