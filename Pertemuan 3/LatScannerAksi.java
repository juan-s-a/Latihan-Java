package pertemuan.pkg3;

public class LatScannerAksi {
    public static void main(String[] args) {
        LatScanner data = new LatScanner();
        
        data.inputData();
    
        System.out.println("PROGRAM NILAI MAHASISWA");
        System.out.println("-----------------------");
        System.out.println("NIM               : " + data.getnim());
        System.out.println("Nama Mahasiswa    : " + data.getnama());
        System.out.println("Nilai Absen       : " + data.getnilaiAbsen());
        System.out.println("Nilai Tugas       : " + data.getnilaiTugas());
        System.out.println("Nilai UTS         : " + data.getnilaiUts());
        System.out.println("Nilai UAS         : " + data.getnilaiUas());
        System.out.println("-----------------------");
        System.out.println("Rata-rata         : " + data.getrataan());
    }
}
