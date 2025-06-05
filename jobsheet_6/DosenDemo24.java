package jobsheet_6;
import java.util.Scanner;

public class DosenDemo24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen24 dataDosen = new DataDosen24();
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua ke Termuda)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Berapa banyak dosen yang ingin dimasukkan? ");
                    int jumlah = sc.nextInt();
                    sc.nextLine(); 
                    
                    for (int i = 0; i < jumlah; i++) {
                        System.out.println("Data Dosen ke-" + (i + 1) + ":");
                        System.out.print("Masukkan kode: ");
                        String kode = sc.nextLine();
                        System.out.print("Masukkan nama: ");
                        String nama = sc.nextLine();
                        System.out.print("Masukkan jenis kelamin (true untuk pria, false untuk wanita): ");
                        boolean jk = sc.nextBoolean();
                        System.out.print("Masukkan usia: ");
                        int usia = sc.nextInt();
                        sc.nextLine(); 
                        
                        Dosen24 dsn = new Dosen24(kode, nama, jk, usia);
                        dataDosen.tambah(dsn);
                    }
                    break;
                case 2:
                    dataDosen.tampil();
                    break;
                case 3:
                    dataDosen.bubbleSortASC();
                    System.out.println("Data berhasil diurutkan ASC (Termuda ke Tertua).\n");
                    break;
                case 4:
                    System.out.println("Pilih metode sorting:");
                    System.out.println("1. Selection Sort");
                    System.out.println("2. Insertion Sort");
                    System.out.print("Pilihan: ");
                    int sortMethod = sc.nextInt();
                    
                    if (sortMethod == 1) {
                        dataDosen.selectionSortDSC();
                    } else {
                        dataDosen.insertionSortDSC();
                    }
                    System.out.println("Data berhasil diurutkan DSC (Tertua ke Termuda).\n");
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}


