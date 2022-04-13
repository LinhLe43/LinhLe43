public class Chuoi {
    public static void main(String[] args) {
        String Chuoi = "You only live once, but if you do right, once is enough";
        int SoTu = Chuoi.length();
        System.out.println("Độ dài chuỗi: "+SoTu);
        char KyTu = 'o';
        int Dem = 0;
        for (int i =0; i < Chuoi.length(); i++){
            if (KyTu == Chuoi.charAt(i)){
                Dem++;
            }
        }
        System.out.print("Vị trí xuất hiện 'o' trong chuỗi: ");
        for (int i =0; i < Chuoi.length(); i++){
            if (KyTu == Chuoi.charAt(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        int ViTri = Chuoi.indexOf('o');
        System.out.println("Số ký tự 'o' xuất hiện trong chuỗi: "+Dem );
    }
}
