package UTS;
import java.util.Scanner;
public class DosenMain {
    public static void main(String[] args) {
        Scanner input24 = new Scanner (System.in);
        
        Dosen[] dosen = {
            new Dosen(1101, "Cahya Rahmad", "cahyaRahmad@gmail.com", 1997, "Sistem Informasi Bisnis"),
            new Dosen(1021, "Deddy Kusbianto", "Kusbianto12@gmail.com",1990,"Teknik Informatika"),
            new Dosen(1202, "Dr. Widaningsih", "WidaningsihCdr@gmail.com",2005, "Manajemen Informatika"),
            new Dosen(1103, "Wilda Imama", "Wildamama@gmail.com", 2011, "Sistem Informasi Bisnis"),
            new Dosen(1204, "Yusriel Adrian", "Adrianyus@gmail.com", 2015, "Teknik Informatika")
        };
        
        int pilihan;
            System.out.print("Masukkan Tahun : ");
            int tahunSekarang = input24.nextInt();
        do {
            System.out.println("====== DATA DOSEN ======");
            System.out.println("1. Menampilkan Data Dosen");
            System.out.println("2. Mengurutkan Data Dosen berdasarkan NIDN (ascending)");
            System.out.println("3. Mencari Data Dosen berdasarkan Nama");
            System.out.println("4. Mengurutkan Data Dosen berdasarkan Masa Kerja (descending)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input24.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("=== Menampilkan Data Dosen ===");
                    for (Dosen d : dosen) {
                        d.tampilkanDataDosen(tahunSekarang);
                    }
                    break;
                case 2:
                    System.out.println("=== Mengurutkan Data Dosen berdasarkan NIDN (ascending) ===");
                    Dosen.urutkanNIDNASC(dosen);
                    for (Dosen d : dosen) {
                        d.tampilkanDataDosen(tahunSekarang);
                    }
                    break;
                case 3:
                //sequential search 
                System.out.println("=== Mencari Data Dosen berdasarkan Nama ===");
                System.out.print("Masukkan nama dosen yang dicari: ");
                input24.nextLine(); 
                String namaDosen = input24.nextLine();
                
                boolean found = false;
                for (Dosen d : dosen){
                    if (d.nama.equalsIgnoreCase(namaDosen)) {
                        d.tampilkanDataDosen(tahunSekarang);
                        found = true;
                        break;
                    }
                }
        
                if (!found) {
                    System.out.println("Dosen dengan nama " + namaDosen + " tidak ditemukan.");
                }
                
                    break;
                case 4:
                    System.out.println("=== Mengurutkan Data Dosen berdasarkan Masa Kerja (descending) ===");
                    Dosen.urutkanMasaKerjaDESC(dosen);
                    for (Dosen d : dosen) {
                        d.tampilkanDataDosen(tahunSekarang);
                    }
                    break;
                case 5:
                    System.out.println("Terimakasih Telah Menggunakan Program Ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 5);
    }
}
