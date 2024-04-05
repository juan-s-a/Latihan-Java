package pertemuan.pkg4;

public class latihanIfClassGO {
    public static void main(String[] args) {
        latihanIfClass enterData = new latihanIfClass();
        
        enterData.inputDetail();
        
        System.out.println("Karyawan yang Bernama\t: " + enterData.showNama());
        System.out.println("Honor yang Diterima");
        System.out.println("Honor Tetap\t: Rp. " + enterData.showHonorTetap());
        System.out.println("Tunjangan Jabatan\t: Rp. " + enterData.showTunjanganJabatan());
        System.out.println("Tunjangan Pendidikan\t: Rp. " + enterData.showTunjanganPendidikan());
        System.out.println("Honor Lembur\t: Rp. " + enterData.showHonorLembur());
        System.out.println("---------------------------------------");
        System.out.println("Honor yang Diterima: Rp." + enterData.showTotalBayaran());
    }
}
