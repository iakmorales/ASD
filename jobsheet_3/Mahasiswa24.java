package jobsheet_3;

public class Mahasiswa24 {
   public String nim;
   public String nama;
   public String kelas;
   public float ipk; 

   static void cetakInfo(Mahasiswa24[] arrayOfMahasiswa) {
    for(int i=0; i < 3; i++){
        System.out.println("Data Mahasiswa ke-" + (i +1));
        System.out.println("NIM    : " + arrayOfMahasiswa[i].nim);
        System.out.println("Nama   : " + arrayOfMahasiswa[i].nama);
        System.out.println("Kelas  : " + arrayOfMahasiswa[i].kelas);
        System.out.println("IPK    : " + arrayOfMahasiswa[i].ipk);
        System.out.println("------------------------------------");
    }
   }
}

