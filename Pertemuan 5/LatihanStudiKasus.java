package pertemuan.pkg5;
import java.io.*;

public class LatihanStudiKasus {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("\t\tPT.PERMATA PRATAMA");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");
        
        String nama;
        System.out.print("Nama Petugas\t\t\t: ");
        nama = input.readLine();
        
        String tanggal;
        System.out.print("Tanggal\t\t\t\t: ");
        tanggal = input.readLine();
    
        int jumlahData;
        System.out.print("Jumlah Data yang Akan Dimasukkan: ");
        jumlahData = Integer.parseInt(input.readLine());
        System.out.println("--------------------------------------------------");
        
        String[] kodeBarang = new String[jumlahData + 1];
        String[] namaBarang = new String[jumlahData + 1];
        int[] jumlahBarang = new int[jumlahData + 1];
        int[] harga = new int[jumlahData + 1];
        int[] totalPerItem = new int[jumlahData + 1];
        
        int x;
        for(x = 1; x <= jumlahData; x++) {
            System.out.println("Data ke-" + x);
            System.out.print("Kode Barang\t:");
            kodeBarang[x] = input.readLine();
            
            System.out.print("Jumlah\t\t: ");
            jumlahBarang[x] = Integer.parseInt(input.readLine());
            
            if(kodeBarang[x].equalsIgnoreCase("P001")) {
                namaBarang[x] = "Printer";
                harga[x] = 700000;
                totalPerItem[x] = 700000 * jumlahBarang[x];
            } else if(kodeBarang[x].equalsIgnoreCase("V001")) {
                namaBarang[x] = "VGA Card";
                harga[x] = 75000;
                totalPerItem[x] = 75000 * jumlahBarang[x];
            } else if(kodeBarang[x].equalsIgnoreCase("M001")) {
                namaBarang[x] = "Motherboard";
                harga[x] = 950000;
                totalPerItem[x] = 950000 * jumlahBarang[x];
            } else {
                System.out.println("KODE BARANG SALAH!");
            }
        }
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t\t\t\tPT.PERMATA PRATAMA");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Nama Petugas\t\t   : " + nama + "\t\t\tTanggal: " + tanggal);
        System.out.println("Jumlah Data yang Dimasukkan: " + jumlahData);
        
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Data Ke\t  Kode Barang\tNama Barang\tHarga Barang\tJumlah Barang\tTotal Harga");
        System.out.println("---------------------------------------------------------------------------------------");
        int num;
        for(num = 1; num <= jumlahData; num++) {
            System.out.println("   " + num + " \t     " + kodeBarang[num] + " \t" + namaBarang[num] + " \t Rp." + harga[num] + " \t      " + jumlahBarang[num] + " \t Rp." + totalPerItem[num]);
        }
        System.out.println("---------------------------------------------------------------------------------------");
        
        int total = 0;
        for(int y = 0; y < totalPerItem.length; y++) {
            total += totalPerItem[y];
        }
        System.out.println("Total pendapatan pada tanggal " + tanggal + " adalah sebesar Rp." + total);
    }
}
