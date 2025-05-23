package jobsheet_9;
import java.util.Scanner;
public class MahasiswaDemo24 {
    public static void main(String[] args) {
        Scanner input24 = new Scanner(System.in);
        StackTugasMahasiswa24 stack = new StackTugasMahasiswa24(5);

        int pilih;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Melihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.println("5. Mahasiswa Yang Pertama Mengumpulkan Tugas");
            System.out.println("6. Jumlah Tugas Yang Sudah Dikumpulkan");
            System.out.print("Pilih menu: ");
            pilih = input24.nextInt();
            input24.nextLine();
             
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = input24.nextLine();
                    System.out.print("NIM: ");
                    String nim = input24.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input24.nextLine();
                    Mahasiswa24 mhs = new Mahasiswa24(nim, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa24 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = input24.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai Tugas %s adalah %d\n", dinilai.nama, nilai);
                        String biner = stack.konversiDesimalKeBiner(nilai);
                        System.out.printf("Nilai Biner Tugas: " + biner);
                    }
                    break;
                case 3:
                    Mahasiswa24 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    stack.peekBottom();
                    break;
                case 6:
                    System.out.println("Jumlah tugas yang sudah dikumpulkan: " + stack.getSize());
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih >= 1 && pilih <= 4);
    }
}
