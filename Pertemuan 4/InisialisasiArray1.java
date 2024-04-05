package pertemuan.pkg4;

public class InisialisasiArray1 {
    public static void main(String[] args) {
        int i;
        double[] nilAkhir = {56.5, 66.7, 87.6, 98.5, 78.9, 85.4};
        
        System.out.println("\nData yang Di-input ke Elemen Array \n");
        for(i = 0; i < 6; i++) {
            System.out.print("Nilai Akhir Index " + i);
            System.out.println(" = " + nilAkhir[i]);
        }
    }
}
