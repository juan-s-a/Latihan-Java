package pertemuan.pkg4;

public class MenghitungLoop2 {
    public static void main(String[] args) {
        int x;
        int y = 0;
        for(x = 1; x <= 19; x += 2) {
            System.out.println(x);
            y += x;
        }
        System.out.println("Total Penjumlahan x: " + y);
    }
}
