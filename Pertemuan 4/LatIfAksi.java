package pertemuan.pkg4;

public class LatIfAksi {
    public static void main(String[] args) {
        latIfClass pesan = new latIfClass();
        
        pesan.inputData();
        
        System.out.println("PENJUALAN KUE PADA TOKO KUE 'LEZAT'\nJl. Sagu No.27A Kebagusan, Jakarta Selatan");
        System.out.println("-----------------------------");
        System.out.println("PEMBELI\t\t:" + pesan.displayNama());
        System.out.println("KODE KUE\t:" + pesan.displayKode());
        System.out.println("NAMA KUE\t:" + pesan.displayNamaKue());
        System.out.println("HARGA\t\t: RP." + pesan.displayHarga());
        System.out.println("JUMLAH BELI\t:" + pesan.displayJumlahBeli());
        System.out.println("-----------------------------");
        System.out.println("TOTAL\t\t: RP." + pesan.displayTotal());
        System.out.println("-----------------------------");
    }
}
