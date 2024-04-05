package pertemuan.pkg4;
import java.util.Scanner;

public class latihanIfClass {
    String nama;
    int golongan;
    String pendidikan;
    int jamKerja;
    double honorTetap;
    double tunjanganJabatan;
    double tunjanganPendidikan;
    double honorLembur;
    double totalBayaran;
    
    Scanner input = new Scanner(System.in);
    
    public void inputDetail() {
        System.out.println("Program Hitung Honor Karyawan Kontrak");
        System.out.println("PT. DINGIN DAMAI");
        System.out.print("Nama Karyawan\t\t: ");
        nama = input.nextLine();
        
        System.out.print("Golongan\t\t: ");
        golongan = input.nextInt();
        
        if(golongan == 1) {
            tunjanganJabatan = 0.05 * 300000;
        } else if(golongan == 2) {
            tunjanganJabatan = 0.1 * 300000;
        } else if(golongan == 3) {
            tunjanganJabatan = 0.15 * 300000;
        }
        
        System.out.print("Pendidikan (SMU/D3/S1)\t\t: ");
        pendidikan = input.nextLine();
        
        if(pendidikan.equals("SMU")) {
            tunjanganPendidikan = 0.025 * 300000;
        } else if(pendidikan.equals("D3")) {
            tunjanganPendidikan = 0.05 * 300000;
        } else if(pendidikan.equals("S1")) {
            tunjanganPendidikan = 0.075 * 300000;
        }
        
        System.out.print("Jumlah Jam Kerja\t\t: ");
        jamKerja = input.nextInt();
        
        if(jamKerja > 8) {
            honorLembur = (jamKerja - 8) * 2500;
        } else {
            honorLembur = 0;
        }
        
        totalBayaran = tunjanganJabatan + tunjanganPendidikan + honorLembur + honorTetap;
    }
    
    public String showNama() {
        return nama;
    }
    public double showHonorTetap() {
        return honorTetap;
    }
    public double showTunjanganJabatan() {
        return tunjanganJabatan;
    }
    public double showTunjanganPendidikan() {
        return tunjanganPendidikan;
    }
    public double showHonorLembur() {
        return honorLembur;
    }
    public double showTotalBayaran() {
        return totalBayaran;
    }
}
