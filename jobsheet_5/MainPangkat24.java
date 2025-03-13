package jobsheet_5;
import java.util.Scanner;
public class MainPangkat24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input24.nextInt();

        Pangkat24[] png = new Pangkat24[elemen];
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input24.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat = input24.nextInt();
            png[i] = new Pangkat24(basis, pangkat);
        }

        System.out.println("HASIL PANGKAT BRUTEFORCE");
        for (Pangkat24 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF(p.nilai, p.pangkat));
            //System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatBF());
        }
        System.out.println("HASIL PANGKAT DIVIDE CONQUER");
        for (Pangkat24 p : png){
            System.out.println(p.nilai + "^" + p.pangkat + ": " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
