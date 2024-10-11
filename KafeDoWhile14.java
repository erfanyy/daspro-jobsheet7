import java.util.Scanner;

public class KafeDoWhile14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        double hargaKopi = 12000;
        double hargaTeh = 7000;
        double hargaRoti = 20000;
        double totalHarga;
        String namaPelanggan;


        do {
            System.out.print("Masukan nama pelanggan (ketik batal untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("Batal")) {
                System.out.println("Transaksi Di Batalkan");
                break;
            }
            System.out.print("Jumlah Kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah Teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah Roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar: Rp " +totalHarga);
            sc.nextLine();

        }while (true);

        System.out.println("Semua Transaksi Selesai.");


    }    
}
