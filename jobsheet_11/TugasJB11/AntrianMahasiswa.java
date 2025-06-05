package jobsheet_11.TugasJB11;

import java.util.Scanner;
public class AntrianMahasiswa {
     static Scanner scanner = new Scanner(System.in);
     static QueueLinkedList queue;

    public static void main(String[] args) {
        System.out.println("=== PROGRAM ANTRIAN LAYANAN UNIT KEMAHASISWAAN ===");
        System.out.print("Masukkan kapasitas maksimal antrian: ");
        int capacity = scanner.nextInt();
        scanner.nextLine(); 

        queue = new QueueLinkedList(capacity);

        int pilihan;
        do {
            tampilkanMenu();
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                     if (queue.isFull()) {
                     System.out.println("Antrian penuh! Tidak bisa menambahkan mahasiswa baru.");
                      return;
                    }

                     System.out.println("\n=== PENDAFTARAN MAHASISWA ===");
                     System.out.print("NIM: ");
                     String nim = scanner.nextLine();
                     System.out.print("Nama: ");
                     String nama = scanner.nextLine();
                     System.out.print("Kelas: ");
                     String kelas = scanner.nextLine();
                     System.out.print("IPK: ");
                     double ipk = scanner.nextDouble();
                     scanner.nextLine(); 

                     MahasiswaTGS mahasiswaBaru = new MahasiswaTGS(nim, nama, kelas, ipk);
                     queue.enqueue(mahasiswaBaru);
                    break;
                case 2:
                     MahasiswaTGS mahasiswaDequeued = queue.dequeue();
                     if (mahasiswaDequeued != null) {
                       System.out.println("\n=== MEMANGGIL MAHASISWA ===");
                       System.out.println("Mahasiswa yang dipanggil: " + mahasiswaDequeued.nama);
                     }
                    break;
                case 3:
                     MahasiswaTGS mahasiswaFront = queue.getFront();
                     if (mahasiswaFront != null) {
                     System.out.println("\n=== MAHASISWA TERDEPAN ===");
                     System.out.println("Mahasiswa terdepan: " + mahasiswaFront.nama);
                     }
                    break;
                case 4:
                     MahasiswaTGS mahasiswaRear = queue.getRear();
                     if (mahasiswaRear != null) {
                     System.out.println("\n=== MAHASISWA TERAKHIR ===");
                     System.out.println("Mahasiswa terakhir: " + mahasiswaRear.nama);
                     }
                    break;
                case 5:
                     System.out.println("\n=== JUMLAH MAHASISWA DALAM ANTRIAN ===");
                     System.out.println("Jumlah mahasiswa yang masih mengantri: " + queue.getSize());
                    break;
                case 6:
                    queue.displayAll();
                    break;
                case 7:
                     System.out.println("\n=== CEK ANTRIAN KOSONG ===");
                     if (queue.isEmpty()) {
                     System.out.println("Antrian saat ini kosong.");
                     } else {
                     System.out.println("Antrian tidak kosong.");
                     }
                    break;
                case 8:
                     System.out.println("\n=== CEK ANTRIAN PENUH ===");
                     if (queue.isFull()) {
                     System.out.println("Antrian saat ini penuh.");
                     } else {
                     System.out.println("Antrian belum penuh.");
                     }
                    break;
                case 9:
                     System.out.println("\n=== MENGOSONGKAN ANTRIAN ===");
                     queue.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan program antrian!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
            System.out.println();
        } while (pilihan != 0);

        scanner.close();
    }

    static void tampilkanMenu() {
        System.out.println("\n=== MENU ANTRIAN LAYANAN KEMAHASISWAAN ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Panggil Mahasiswa dari Antrian");
        System.out.println("3. Lihat Mahasiswa Terdepan");
        System.out.println("4. Lihat Mahasiswa Terakhir");
        System.out.println("5. Lihat Jumlah Mahasiswa dalam Antrian");
        System.out.println("6. Tampilkan Semua Mahasiswa dalam Antrian");
        System.out.println("7. Cek Antrian Kosong");
        System.out.println("8. Cek Antrian Penuh");
        System.out.println("9. Kosongkan Antrian");
        System.out.println("0. Keluar Program");
        System.out.println("=======================================");
    }
}
