import java.util.Scanner;

public class NilaiMahasiswa14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai;
        double tertinggi = Double.MIN_VALUE;
        double terendah = Double.MAX_VALUE;
        int lulus = 0;
        int tidakLulus = 0;

       for (int i = 1; i <= 10; i++) {
            System.out.print("Masukan nilai mahasiswa ke- " + i + ": ");
            nilai = sc.nextDouble();

            if (nilai < 0 || nilai > 100) {
                System.out.println("Nilai harus antara 0 dan 100! Silahkan coba lagi");
                continue;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
            if (nilai >= 60) {
                lulus++;
            }else {
                tidakLulus++;
            }

       }

       System.out.println("Nilai tertinggi : " +tertinggi);
       System.out.println("Nilai Terendah : " +terendah);
       System.out.println("Jumlah Mahasiswa Lulus : " +lulus);
       System.out.println("Jumlah Mahasiswa Tidak Lulus : " +tidakLulus);


    }
}
