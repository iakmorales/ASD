package jobsheet_3;

public class DataDosen {
    
    // a. Menampilkan semua data dosen
    public static void dataSemuaDosen(Dosen24[] arrayOfDosen) {
        System.out.println("\n=== Data Semua Dosen ===");
        for (Dosen24 dosen : arrayOfDosen) {
            System.out.println("Kode         : " + dosen.kode);
            System.out.println("Nama         : " + dosen.nama);
            System.out.println("Jenis Kelamin: " + dosen.jenisKelamin);
            System.out.println("Usia         : " + dosen.usia);
            System.out.println("-----------------------------");
        }
    }

    // b. Menampilkan jumlah dosen per jenis kelamin
    public static void jumlahDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int pria = 0, wanita = 0;

        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                pria++;
            } else if (dosen.jenisKelamin.equalsIgnoreCase("Wanita")) {
                wanita++;
            }
        }

        System.out.println("\n=== Jumlah Dosen Per Jenis Kelamin ===");
        System.out.println("Pria  : " + pria);
        System.out.println("Wanita: " + wanita);
    }

    // c. Menampilkan rata-rata usia dosen per jenis kelamin
    public static void rerataUsiaDosenPerJenisKelamin(Dosen24[] arrayOfDosen) {
        int totalUsiaPria = 0, totalUsiaWanita = 0;
        int countPria = 0, countWanita = 0;

        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.jenisKelamin.equalsIgnoreCase("Pria")) {
                totalUsiaPria += dosen.usia;
                countPria++;
            } else if (dosen.jenisKelamin.equalsIgnoreCase("Wanita")) {
                totalUsiaWanita += dosen.usia;
                countWanita++;
            }
        }

        System.out.println("\n=== Rata-rata Usia Dosen Per Jenis Kelamin ===");
        System.out.println("Pria  : " + (countPria == 0 ? "Tidak ada data" : (totalUsiaPria / (double) countPria)));
        System.out.println("Wanita: " + (countWanita == 0 ? "Tidak ada data" : (totalUsiaWanita / (double) countWanita)));
    }

    // d. Menampilkan data dosen paling tua
    public static void infoDosenPalingTua(Dosen24[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }

        Dosen24 dosenTertua = arrayOfDosen[0];

        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.usia > dosenTertua.usia) {
                dosenTertua = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Tua ===");
        System.out.println("Kode         : " + dosenTertua.kode);
        System.out.println("Nama         : " + dosenTertua.nama);
        System.out.println("Jenis Kelamin: " + dosenTertua.jenisKelamin);
        System.out.println("Usia         : " + dosenTertua.usia);
    }

    // e. Menampilkan data dosen paling muda
    public static void infoDosenPalingMuda(Dosen24[] arrayOfDosen) {
        if (arrayOfDosen.length == 0) {
            System.out.println("\nTidak ada data dosen.");
            return;
        }

        Dosen24 dosenTermuda = arrayOfDosen[0];

        for (Dosen24 dosen : arrayOfDosen) {
            if (dosen.usia < dosenTermuda.usia) {
                dosenTermuda = dosen;
            }
        }

        System.out.println("\n=== Dosen Paling Muda ===");
        System.out.println("Kode         : " + dosenTermuda.kode);
        System.out.println("Nama         : " + dosenTermuda.nama);
        System.out.println("Jenis Kelamin: " + dosenTermuda.jenisKelamin);
        System.out.println("Usia         : " + dosenTermuda.usia);
    }
}


