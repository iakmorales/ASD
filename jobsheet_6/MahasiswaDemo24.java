package jobsheet_6;
import java.util.Scanner;
public class MahasiswaDemo24 {
    public static void main(String[] args) {
       MahasiswaBerprestasi24 list = new MahasiswaBerprestasi24();
        Scanner input24 = new Scanner(System.in);
       
        System.out.print("Masukkan jumlah data mahasiswa : ");
        int jumlah = input24.nextInt();
        input24.nextLine();

        Mahasiswa24[] arrayOfMahasiswa = new Mahasiswa24[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM : ");
            String nim = input24.nextLine();
            System.out.print("Nama : ");
            String nama = input24.nextLine();
            System.out.print("Kelas : ");
            String kelas = input24.nextLine();
            System.out.print("IPK : ");
            double ipk = input24.nextDouble();
            input24.nextLine();
            System.out.println("-----------------------------");
            arrayOfMahasiswa[i] = new Mahasiswa24(nim, nama, kelas, ipk);
            list.tambah(arrayOfMahasiswa[i]);
        }

        
        //System.out.println("Data Mahasiswa sebelum sorting: ");
        //list.tampil();

        //System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
        //list.bubbleSort();
        //list.tampil();

        //System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        //list.SelectionSort();
        //list.tampil();

        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC) : ");
        list.insertionSort();
        list.tampil();

       //Mahasiswa24 m1 = new Mahasiswa24("123", "Zidan", "2A", 3.2);
       //Mahasiswa24 m2 = new Mahasiswa24("124", "Ayu", "2A", 3.5);
       //Mahasiswa24 m3 = new Mahasiswa24("125", "Sofi", "2A", 3.1);
       //Mahasiswa24 m4 = new Mahasiswa24("126", "Mita", "2A", 3.9);
       //Mahasiswa24 m5 = new Mahasiswa24("127", "Miki", "2A", 3.7);

       //list.tambah(m1);
       //list.tambah(m2);
       //list.tambah(m3);
       //list.tambah(m4);
       //list.tambah(m5);

       //System.out.println("Data Mahasiswa sebelum sorting: ");
       //list.tampil();

       //System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC) : ");
       //list.bubbleSort();
       //list.tampil();
    }
}
