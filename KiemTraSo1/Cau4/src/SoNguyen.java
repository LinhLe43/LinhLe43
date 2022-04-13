public class SoNguyen {
    public static void main(String[] args) {

        // Lấy số nguyên tố nhỏ hơn 10
        System.out.println("Các số nguyên tố nhỏ hơn 10 là: ");
        for (int i = 0; i < 10; i++) {
            if (isPrimeNumber(i)) {
                System.out.print(i +" ");
            }
        }
        System.out.println("\n---------------");

        // Lấy 10 số Nguyên Tố đầu tiên
        int SoLuong = 10;
        System.out.printf("10 số nguyên tố đầu tiên là: ", SoLuong);
        int dem = 0;
        int i = 0;
        while (dem < SoLuong) {
            if (isPrimeNumber(i)) {
                System.out.print(i+" ");
                dem++;
            }
            i++;
        }
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
