import java.util.Scanner;

public class TotalPembayaranParkir14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.print("Masukan Jenis Kendaraan (1 untuk Motor, 2 untuk Mobil, 0 untuk Keluar): ");
            int jenis = sc.nextInt();
            if (jenis == 0) {
                break;
            }
            System.out.print("Masukan Durasi Parkir (jam): ");
            int durasi = sc.nextInt();

            if (durasi > 5 ) {
                total += 12500;
            }else {
                if (jenis == 1) {
                    total += durasi * 2000;
                }else if (jenis == 2) {
                    total += durasi * 3000;
                }else {
                    System.out.println("Jenis Kendaraan tidak valid!");
                }
            }
        }
        System.out.println("Total pembayaran parkir: Rp " + total);
    }    
    
}
