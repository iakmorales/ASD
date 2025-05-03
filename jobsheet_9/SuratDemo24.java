package jobsheet_9;

import java.util.Scanner;
public class SuratDemo24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        StackSurat24 stack = new StackSurat24(5);

        int pilihan;
        do {
            System.out.println("\n==== Menu ====");
            System.out.println("1. Masukkan Data Surat");
            System.out.println("2. Verifikasi Surat");
            System.out.println("3. Melihat Surat Yang Terakhir Dikirim");
            System.out.println("4. Cari Surat Berdasarkan Nama Mahasiswa");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input24.nextInt();
            input24.nextLine();

            System.out.println();

            switch (pilihan) {
                case 1:
                    System.out.print("ID Surat: ");
                    String idSurat = input24.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String namaMahasiswa = input24.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input24.nextLine();
                    System.out.print("Jenis Izin (I untuk Izin, S untuk Sakit): ");
                    char jenisIzin = input24.next().charAt(0);
                    System.out.print("Durasi (dalam hari): ");
                    int durasi = input24.nextInt();
                    Surat24 surat = new Surat24(idSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.println("\nData surat berhasil dimasukkan.");
                    break;
                case 2:
                    Surat24 suratDiverifikasi = stack.pop();
                    if (suratDiverifikasi != null) {
                        System.out.println("\nSurat dari " + suratDiverifikasi.namaMahasiswa + " Dengan ID Surat " 
                        + suratDiverifikasi.idSurat + " telah diverifikasi.");
                    }
                    break;
                case 3:
                    Surat24 suratTerakhir = stack.peek();
                    if (suratTerakhir != null) {
                        System.out.println("\nSurat terakhir dikirim oleh " + suratTerakhir.namaMahasiswa + " Dengan ID Surat " 
                        + suratTerakhir.idSurat);
                    }
                    break;
                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String namaDicari = input24.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i <= stack.top; i++) {
                        if (stack.stack[i].namaMahasiswa.equalsIgnoreCase(namaDicari)) {
                            System.out.println("\nSurat ditemukan: ID Surat " + stack.stack[i].idSurat + ", Kelas " + stack.stack[i].kelas + 
                            ", Jenis Izin " + stack.stack[i].jenisIzin + ", Durasi " + stack.stack[i].durasi);
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("\nSurat tidak ditemukan untuk nama mahasiswa " + namaDicari);
                    }
                    break;
                case 5:
                    System.out.println("\nTerimakasih telah menggunakan program.");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid!");
            }
        } while (pilihan != 5);
    }
}
