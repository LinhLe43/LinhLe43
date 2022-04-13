import java.util.Random;

public class SoNguyenNgauNhien {
    public static void main(String[] args) {
        Random Rd = new Random();
        int SoNgauNhien = Rd.nextInt(100);
        System.out.println("Số ngẫu nhiên: "+SoNgauNhien);
        if (isPrimeNumber(SoNgauNhien)){
            System.out.println("Là số nguyên tố");
        } else System.out.println("Không phải là số nguyên tố");
    }
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
