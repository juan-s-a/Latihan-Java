package pertemuan.pkg4;
import java.util.Scanner;

public class BilFibonacci {
    public static void main(String[] args) {
        int bil;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Jumlah Bilangan Fibonacci: ");
        bil = input.nextInt();
        input.close();
        
        int sekarang = 1;
        int akhir = 1;
        System.out.print(" " + akhir);
        System.out.print(" " + sekarang);
        
        int palAkhir;
        for(int bilF = 2; bilF < bil; bilF++) {
            palAkhir = akhir;
            akhir = sekarang;
            sekarang = palAkhir + akhir;
            System.out.print(" " + sekarang);
        }
    }
}
