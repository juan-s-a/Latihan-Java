package pertemuan.pkg4;

public class InisialisasiArray2 {
    public static void main(String[] args) {
        int i, j;
        int[][] nilAkhir = {{150, 159, 230}, {100, 125, 150}, {210, 125, 156}};
        
        System.out.println("Data yang Di-input ke Elemen Array \n");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.print("Nilai Akhir Index [" + i + "] [" + j + "] = ");
                System.out.println(" = " + nilAkhir[i][j]);
            }
        }
    }
}
