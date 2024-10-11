import java.util.Scanner;

public class Parkir {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalBayar = 0;
        int durasiParkir;
        
        while (true) {
            System.out.print("Masukkan durasi parkir (jam, 0 untuk keluar): ");
            durasiParkir = scanner.nextInt();
            
            if (durasiParkir == 0) {
                break;
            }
            
            System.out.print("Masukkan jenis kendaraan (1: mobil, 2: motor): ");
            int jenisKendaraan = scanner.nextInt();
            
            if (durasiParkir > 5) {
                totalBayar += 12500;
            } else {
                if (jenisKendaraan == 1) {
                    totalBayar += durasiParkir * 3000;
                } else if (jenisKendaraan == 2) {
                    totalBayar += durasiParkir * 2000;
                }
            }
        }
        
        System.out.println("Total pembayaran: Rp " + totalBayar);
    }
}