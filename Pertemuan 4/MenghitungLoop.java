package pertemuan.pkg4;

public class MenghitungLoop {
    public static void main(String[] args) {
        int x;
        int y = 0;
        for(x = 2; x <= 20; x += 2) {
            System.out.println(x);
            y += x;
        }
        System.out.println("Total Penjumlahan Seluruh Nilai x: " + y);
    }
}
