package pertemuan.pkg4;
import java.util.Scanner;

public class LatArray2 {
    public static void main(String[] args) {
        int i, j;
        int[][] dataJual;
        dataJual = new int[3][3];
        Scanner input = new Scanner(System.in);
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.print("Masukkan Data Jual ke [" + i + "] [" + j + "] =");
                dataJual[i][j] = input.nextInt();
            }
            System.out.println();
        }
        System.out.println("\n\nData Jual yang Di-input ke Elemen Array \n");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.print("Nilai Data Jual [" + i + "] [" + j + "]");
                System.out.println(" = " + dataJual[i][j]);
            }
            System.out.println();
        }
    }
}
