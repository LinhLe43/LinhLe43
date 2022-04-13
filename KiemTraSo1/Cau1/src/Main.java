public class Main {
    public static void main(String[] args) {
        // In ra hình tam giác
        System.out.println("Tam giác: ");
        for (int i = 1; i <=4; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("----------");
        // In ra hình vuông
        System.out.println("Hình vuông: ");
        for (int i = 1; i <=4; i++){
            for (int j = 1; j <=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
