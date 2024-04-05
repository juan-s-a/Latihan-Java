package pertemuan.pkg4;
import java.util.Scanner;

public class latIfClass {
    String nama;
    String kode;
    int jumlahBeli;
    String namaKue;
    int harga;
    int total;
    
    Scanner input = new Scanner(System.in);
    
    public void inputData() {
        System.out.println("Kode Kue\tNama Kue\tHarga");
        System.out.println("B001\t\tBolu\t\t10000");
        System.out.println("C001\t\tCake\t\t20000");
        System.out.println("T001\t\tTart\t\t15000");
        System.out.print("Masukkan Nama Pembeli             : ");
        nama = input.nextLine();
        System.out.print("Masukkan Kode [B001 | C001 | T001]: ");
        kode = input.nextLine();
        System.out.print("Masukkan Jumlah Beli              : ");
        jumlahBeli = input.nextInt();
        
        if(kode.equals("B001")) {
            namaKue = "Bolu";
            harga = 10000;
            total = harga * jumlahBeli;
        } else if(kode.equals("C001")) {
            namaKue = "Cake";
            harga = 20000;
            total = harga * jumlahBeli;
        } else if(kode.equals("T001")) {
            namaKue = "Tart";
            harga = 15000;
            total = harga * jumlahBeli;
        }
    }
    
    public String displayNama() {
        return nama;
    }
    public String displayKode() {
        return kode;
    }
    public String displayNamaKue() {
        return namaKue;
    }
    public int displayHarga() {
        return harga;
    }
    public int displayJumlahBeli() {
        return jumlahBeli;
    }
    public int displayTotal() {
        return total;
    }
    
}
