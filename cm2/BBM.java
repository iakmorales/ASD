import java.util.Scanner;

public class BBM {
    String namaBBM;
    double hargaPerliter;
    int jumlahLiter;
    double totalBayar;

    public BBM() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama BBM: ");
        namaBBM = input.nextLine();

        while (true) {
            System.out.print("Masukkan harga per liter: ");
            hargaPerliter = input.nextDouble();
            if (hargaPerliter < 0) {
                System.out.println("Harga per liter tidak boleh negatif! Silakan input ulang.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Masukkan jumlah liter: ");
            jumlahLiter = input.nextInt();
            if (jumlahLiter < 0) {
                System.out.println("Jumlah liter tidak boleh negatif! Silakan input ulang.");
            } else {
                break;
            }
        }

        totalBayar = hargaPerliter * jumlahLiter;
    }
    public BBM(String namaBBM, double hargaPerliter, int jumlahLiter) {
        this.namaBBM = namaBBM;
        this.hargaPerliter = hargaPerliter;
        this.jumlahLiter = jumlahLiter;
        this.totalBayar = hargaPerliter * jumlahLiter;
    }
}

