package jobsheet_11.TugasJB11;

public class MahasiswaTGS {
    String nim, nama, kelas;
    double ipk;

    MahasiswaTGS(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi(){
        System.out.printf("%-10s %-15s %-5s %-4.2f\n", nama, nim, kelas, ipk);
    }
}
