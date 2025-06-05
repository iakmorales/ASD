package jobsheet_10;
import java.util.Scanner;
public class LayananAntrianKRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS antrian = new AntrianKRS(10);

        int pilih;
        do {
            System.out.println("\n--- MENU ANTRIAN KRS ---");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil 2 Mahasiswa");
            System.out.println("3. Tampilkan Semua Antrian");
            System.out.println("4. Tampilkan 2 Terdepan");
            System.out.println("5. Tampilkan Antrian Terakhir");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cetak Jumlah Antrian");
            System.out.println("8. Cetak Jumlah yang Sudah Diproses");
            System.out.println("9. Cetak Mahasiswa Belum Diproses");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    if (!antrian.isFull()) {
                        System.out.print("Masukkan NIM: ");
                        String nim = sc.nextLine();
                        System.out.print("Masukkan Nama: ");
                        String nama = sc.nextLine();
                        MahasiswaKRS m = new MahasiswaKRS(nim, nama);
                        antrian.menambahAntrian(m);
                    } else {
                        System.out.println("Antrian sudah penuh.");
                    }
                    break;
                case 2:
                    antrian.panggilAntrian();
                    break;
                case 3:
                    antrian.tampilkanSemuaAntrian();
                    break;
                case 4:
                    antrian.tampilkanDuaTerdepan();
                    break;
                case 5:
                    antrian.tampilkanTerakhir();
                    break;
                case 6:
                    antrian.clear();
                    break;
                case 7:
                    antrian.cetakJumlahAntrian();
                    break;
                case 8:
                    antrian.cetakJumlahProses();
                    break;
                case 9:
                    antrian.cetakBelumProses();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
    }
}

