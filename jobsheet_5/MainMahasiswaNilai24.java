package jobsheet_5;

public class MainMahasiswaNilai24 {
        public static void main(String[] args) {
            int[] uts = {78, 85, 90, 76, 79, 88, 80, 82};
            int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};
    
            MahasiswaNilai24 mahasiswa = new MahasiswaNilai24(uts, uas);

            int nilaimax = mahasiswa.cariMaxBruteforce();
            int nilaimin = mahasiswa.cariMinBruteforce();

            int nilaiTertinggi = mahasiswa.cariMaksimum(0, uts.length - 1);
            
            int nilaiTerendah = mahasiswa.cariMinimum(0, uts.length - 1);
            
            double rataRataUAS = mahasiswa.hitungRataRata();
    
            System.out.println("===== HASIL PERHITUNGAN NILAI MAHASISWA =====");
            System.out.println("Nilai UTS Tertinggi : " + nilaimax);
            System.out.println("Nilai UTS Terendah  : " + nilaimin);
            System.out.println("Nilai UTS Tertinggi : " + nilaiTertinggi);
            System.out.println("Nilai UTS Terendah  : " + nilaiTerendah);
            System.out.println("Rata-rata Nilai UAS : " + rataRataUAS);
    }
}
    

