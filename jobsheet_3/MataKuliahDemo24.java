package jobsheet_3;
import java.util.Scanner;
public class MataKuliahDemo24 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Masukkan Jumlah Mata Kuliah : ");
       int jumlah = sc.nextInt(); 
       sc.nextLine();
       MataKuliah24[] arrayOfMatakuliah = new MataKuliah24[jumlah];

       for(int i =0; i < jumlah; i++){
          arrayOfMatakuliah[i] = new MataKuliah24();
          arrayOfMatakuliah[i].tambahData(sc);
        }

        for(int i = 0; i < jumlah; i++){
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].cetakInfo();
        }
    }
}
