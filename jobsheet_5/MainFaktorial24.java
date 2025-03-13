package jobsheet_5;
import java.util.Scanner;
public class MainFaktorial24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Masukkan nilai: ");
        int nilai = input24.nextInt();

        Faktorial24 fk = new Faktorial24();
        //System.out.println("Nilai Faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF_while(nilai));
        System.out.println("Nilai Faktorial " + nilai + " menggunakan BF: " + fk.faktorialBF_doWhile(nilai));
        System.out.println("Nilai faktorial " + nilai + " menggunakan DC: " + fk.faktorialDC(nilai));
    }
}
