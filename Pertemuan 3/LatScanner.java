package pertemuan.pkg3;
import java.util.Scanner;

public class LatScanner {
    public int nim;
    public String nama;
    public float nilaiAbsen;
    public float nilaiTugas;
    public float nilaiUts;
    public float nilaiUas;
    
    Scanner input = new Scanner(System.in);
    
    public int getnim() {
        return nim;
    }
    
    public String getnama() {
        return nama;
    }
    
    public float getnilaiAbsen() {
        return nilaiAbsen;
    }
    
    public float getnilaiTugas() {
        return nilaiTugas;
    }
    
    public float getnilaiUts() {
        return nilaiUts;
    }
    
    public float getnilaiUas() {
        return nilaiUas;
    }
    
    public void inputData() {
        System.out.print("Masukkan NIM: ");
        nim = input.nextInt();
        
        System.out.print("Masukkan Nama: ");
        nama = input.nextLine();
        
        System.out.println(" ");
        
        System.out.print("Masukkan Nilai Absen: ");
        nilaiAbsen = input.nextFloat();
        
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = input.nextFloat();
        
        System.out.print("Masukkan Nilai UTS: ");
        nilaiUts = input.nextFloat();
        
        System.out.print("Masukkan Nilai UAS: ");
        nilaiUas = input.nextFloat();
    }
    
    public double getrataan() {
        return (0.1 * nilaiAbsen) + (0.2 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);
    }
    
}
