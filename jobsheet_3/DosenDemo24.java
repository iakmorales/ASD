package jobsheet_3;
import java.util.Scanner;
public class DosenDemo24 {
   public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
     
       System.out.print("Masukkan Jumlah Dosen : ");
       int jumlah = sc.nextInt(); 
       sc.nextLine();

       Dosen24[] arrayOfDosen = new Dosen24[jumlah];
        
        for(int i=0; i < jumlah; i++){
           System.out.println("Masukkan Data Dosen ke-" + (i +1));
           System.out.print("Kode          : ");
           String kode = sc.nextLine();
           System.out.print("Nama          : "); 
           String nama = sc.nextLine();
           System.out.print("Jenis Kelamin : ");
           String jenisKelamin = sc.nextLine();
           System.out.print("Usia          : ");
           int usia = sc.nextInt();
           System.out.println("-----------------------------");
           sc.nextLine();
           arrayOfDosen[i] = new Dosen24(kode,nama, jenisKelamin, usia);
      }

         
        for (Dosen24 dosen : arrayOfDosen) {
            dosen.tampilkanDosen(arrayOfDosen);
        }

        DataDosen.dataSemuaDosen(arrayOfDosen);
        DataDosen.jumlahDosenPerJenisKelamin(arrayOfDosen);
        DataDosen.rerataUsiaDosenPerJenisKelamin(arrayOfDosen);
        DataDosen.infoDosenPalingTua(arrayOfDosen);
        DataDosen.infoDosenPalingMuda(arrayOfDosen);

   } 
}
