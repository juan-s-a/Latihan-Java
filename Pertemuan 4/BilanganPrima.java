package pertemuan.pkg4;

public class BilanganPrima {
    public static void main(String[] args) {
        for(int x = 2; x < 20; x++) {
            for(int y = 2; y <= x; y++) {
                if(y == x) {
                    System.out.print(" " + x);
                }
                if(x % y == 0) {
                    break;
                }
            }
        }
    }
}
