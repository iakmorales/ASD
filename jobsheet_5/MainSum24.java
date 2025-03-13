package jobsheet_5;
import java.util.Scanner;
public class MainSum24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input24.nextInt();

        Sum24 sm = new Sum24(elemen);
        for(int i = 0; i < elemen; i++){
            System.out.print("Masukkan Keuntungan ke-" + (i+1) + ": ");
            sm.keuntungan[i] = input24.nextDouble();
        }

        System.out.println("Total Keuntungan menggunakan Bruteforce: " + sm.totalBF());
        System.out.println("Total Keuntungan menggunakan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, sm.keuntungan.length-1));
    }
}

