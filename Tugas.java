import java.util.Scanner;

public class Tugas2713 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalBayar = 0;
        
        while (true) {
            System.out.println("Pilih jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            int jenisKendaraan = scanner.nextInt();

            if (jenisKendaraan == 0) {
                break; 
            }

            System.out.println("Masukkan durasi parkir (jam): ");
            int durasiParkir = scanner.nextInt();

            int tarif = 0;
            if (durasiParkir <= 5) {
                if (jenisKendaraan == 1) {
                    tarif = durasiParkir * 3000;
                } else if (jenisKendaraan == 2) {
                    tarif = durasiParkir * 2000;
                }
            } else {
                tarif = 12500;
            }

            System.out.println("Total bayar: Rp " + tarif);
            totalBayar += tarif;
        }

        System.out.println("Total pembayaran parkir: Rp " + totalBayar);
        scanner.close();
    }
}