package jobsheet_11;
import java.util.Scanner;
public class SLLMain24 {

    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);

        SingleLinkedList24 sll = new SingleLinkedList24();
        int pilihan;
        do {
            System.out.println("==== Program Single Linked List ====");
            System.out.println("1. Tambah Data Mahasiswa di awal");
            System.out.println("2. Tambah Data Mahasiswa di akhir");
            System.out.println("3. Tambah Data Mahasiswa setelah data tertentu");
            System.out.println("4. Tambah Data Mahasiswa di posisi tertentu");
            System.out.println("5. Tampilkan Data Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan (0-5): ");
            pilihan = input24.nextInt();
            input24.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("=== Tambah Data Mahasiswa di Awal ===");
                    sll.addFirst(inputMhs(input24));
                    break;
                case 2:
                    System.out.println("=== Tambah Data Mahasiswa di Akhir ===");
                    sll.addLast(inputMhs(input24));
                    break;
                case 3:
                    System.out.println("=== Tambah Data Mahasiswa Setelah Data Tertentu ===");
                    System.out.print("Masukkan nama mahasiswa yang diinginkan: ");
                    String key = input24.nextLine();
                    sll.insertAfter(key, inputMhs(input24));
                    break;
                case 4:
                    System.out.println("=== Tambah Data Mahasiswa di Posisi Tertentu ===");
                    System.out.print("Masukkan posisi yang diinginkan: ");
                    int pos = input24.nextInt();
                    input24.nextLine();
                    sll.insertArt(pos, inputMhs(input24));
                    break;
                case 5:
                    System.out.println("=== Tampilkan Data Mahasiswa ===");
                    sll.print();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 0);
    }

    static Mahasiswa24 inputMhs(Scanner input24) {
        System.out.print("Masukkan NIM: ");
        String nim = input24.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = input24.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = input24.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = input24.nextDouble();
        input24.nextLine();
        return new Mahasiswa24(nim, nama, kelas, ipk);
    }
}