package pertemuan.pkg4;
import java.util.Scanner;

public class LatArray1 {
    public static void main(String[] args) {
        int i;
        int[] nilAkhir;
        
        nilAkhir = new int[6];
        Scanner input = new Scanner(System.in);
        for(i = 0; i < 6; i++) {
            System.out.print("Masukkan Array ke- " + i + " = ");
            nilAkhir[i] = input.nextInt();
        }
        System.out.println("\n\nData yang Di-input ke Elemen Array \n");
        for(i = 0; i < 6; i++) {
            System.out.print("Nilai Akhir Index " + i);
            System.out.println(" = " + nilAkhir[i]);
        }
    }
}
