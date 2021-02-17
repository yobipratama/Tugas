
import java.util.Scanner;

public class nomor3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================================");
        System.out.println("            PROGRAM MENAMPILKAN DERET BILANGAN GENAP            ");
        System.out.println("==================================================================");
        System.out.println("Masukkan jumlah deret : ");
        int d = sc.nextInt();
        System.out.println("==================================================================");
        System.out.println("Hasilnya yaitu : ");
        int z, h;
        for (z = 0; z <= d; z++) {
            if (z % 2 == 0) {
                System.out.print(" , ");

            } else {
                h = z * 2;
                System.out.print(h);
            }

        }
        System.out.println("");
    }

}
