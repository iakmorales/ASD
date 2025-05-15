package jobsheet_11;

public class Mahasiswa24 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa24() {

    }

    Mahasiswa24(String nm, String name, String kls, double ip) {
        nim = nm;
        nama = name;
        kelas = kls;
        ipk = ip;
    }

    public void tampilInformasi(){
        System.out.printf("%-10s %-15s %-5s %-4.2f\n", nama, nim, kelas, ipk);
    }
}
