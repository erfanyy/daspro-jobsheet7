import java.util.Scanner;

public class PenjualanTiketBioskop14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int harga_tiket = 50000;
        int totalTiketTerjual = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.print("Masukan jumlah tiket yang dibeli (ketik 0 untuk keluar): ");
            int jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silahkan coba lagi!");
                continue;
            }
            int hargaTotal = jumlahTiket * harga_tiket;

            if (jumlahTiket > 10) {
                hargaTotal *= 0.85;
            } else if (jumlahTiket > 4) {
                hargaTotal *= 0.90;
            }

            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaTotal;

            System.out.println("Harga Total Untuk " + jumlahTiket + " Tiket Adalah: Rp " + hargaTotal);
        }

        System.out.println("Total Tiket Terjual: " + totalTiketTerjual);
        System.out.println("Total Penjualan: Rp " + totalPenjualan);
    }
    
}
