package jobsheet_3;
import java.util.Scanner;
public class MataKuliah24 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah24() {

    }

    public MataKuliah24 (String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    void tambahData(Scanner sc){
        System.out.print("Kode       : ");
        kode = sc.nextLine();
        System.out.print("Nama       : ");
        nama = sc.nextLine();
        System.out.print("SKS        : ");
        sks = sc.nextInt();
        System.out.print("Jumlah Jam : ");
        jumlahJam = sc.nextInt();
        System.out.println("--------------------------");
        sc.nextLine();
    }

    void cetakInfo() {
        System.out.println("Kode        : " + kode);
        System.out.println("Nama        : " + nama);
        System.out.println("SKS         : " + sks);
        System.out.println("Jumlah Jam  : " + jumlahJam);
        System.out.println("--------------------------");
    }
}
