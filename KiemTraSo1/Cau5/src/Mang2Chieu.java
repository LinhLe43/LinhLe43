import java.util.Scanner;

public class Mang2Chieu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int SoDong, SoCot;
        System.out.println("Số dòng: ");
        SoDong = sc.nextInt();
        System.out.println("Số cột: ");
        SoCot = sc.nextInt();

        // Nhập giá trị mảng A từ bàn phím
        int MangA [][] = new int[SoDong][SoCot];
        for (int i = 0; i < SoDong; i++){
            for (int j = 0; j < SoCot; j++){
                System.out.println("Nhập phần tử thứ ["+i+","+j+"]");
                MangA[i][j] = sc.nextInt();
            }
        }

        // In mảng A
        System.out.println("Ma trận: ");
        for (int i = 0; i < SoDong; i++){
            for (int j = 0; j < SoCot; j++){
                System.out.print(MangA[i][j] +"\t");
            }
            System.out.println("\n");
        }

        // Lấy giá trị đường chéo chính của mảng A
        System.out.println("\n----------");
        System.out.println("Đường chéo chính: ");
        for (int i = 0; i < SoDong; i++){
            for (int j = 0; j < SoCot; j++){
                if (i == j){
                    System.out.println(MangA[i][j]);
                }
            }
        }

        //Nhập thêm mảng B
        int MangB [][] =  new int[2][2];
        MangB [0][0] = 2;
        MangB [0][1] = 2;
        MangB [1][0] = 2;
        MangB [1][1] = 2;

        //Tính Mảng C = Mảng A + Mảng B
        int MangC [][] = new int[2][2];
        for (int i = 0; i <2; i++){
            for (int j = 0; j < 2; j++){
                MangC[i][j] = MangA[i][j] + MangB[i][j];
            }
        }

        //In ra ma trận mảng C
        System.out.println("\n---------");
        System.out.println("Tổng 2 ma trận: ");
        for (int i =0; i <2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(MangC[i][j] +"\t");
            }
            System.out.println("\n");
        }
    }
}
