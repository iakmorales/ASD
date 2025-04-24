package UTS;

public class Dosen {
    int NIDN;
    String nama;
    String email;
    int tahunMasuk;
    String prodi;

    public Dosen(int NIDN, String nama, String email, int tahunMasuk, String prodi) {
        this.NIDN = NIDN;
        this.nama = nama;
        this.email = email;
        this.tahunMasuk = tahunMasuk;
        this.prodi = prodi;
    }

    int hitungMasaKerja(int tahunSekarang) {
        return tahunSekarang - tahunMasuk;
    }
    
    void tampilkanDataDosen(int tahunSekarang) {
        System.out.println("------------------");
        System.out.println("NIDN        : " + NIDN);
        System.out.println("Nama        : " + nama);
        System.out.println("Email       : " + email);
        System.out.println("Masa Kerja  : " + hitungMasaKerja(tahunSekarang) + " tahun");
        System.out.println("Prodi       : " + prodi);
    }

    //Selection Sort
    static void urutkanNIDNASC(Dosen[] dosen) {
        for (int i = 0; i < dosen.length-1; i++) {  
            int minIndex = i;
            for (int j = i + 1; j < dosen.length; j++) {
                if (dosen[j].NIDN < dosen[minIndex].NIDN) {
                    minIndex = j;
                }
            }
            Dosen temp = dosen[i];
            dosen[i] = dosen[minIndex];
            dosen[minIndex] = temp;
        }
    }
    
    //Bubble Sort
    static void urutkanMasaKerjaDESC(Dosen[] dosen){
        for (int i = 0; i < dosen.length-1; i++) {
            for (int j = 1; j < dosen.length-i; j++) {
                if (dosen[j].hitungMasaKerja(i) > dosen[j-1].hitungMasaKerja(i)) {
                    Dosen temp = dosen[j];
                    dosen[j] = dosen[j-1];
                    dosen[j-1] = temp;                   
                }
            }
        }
    }

}
