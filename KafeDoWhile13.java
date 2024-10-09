import java.util.Scanner;
public class KafeDoWhile13 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int kopi,teh,roti;
        String namaPelanggan;
        double totalHarga,hargaKopi,hargaTeh,hargaRoti;
        hargaKopi = 12000;
        hargaTeh = 7000;
        hargaRoti = 20000;
        
        do{
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan");
                break;
            }
            System.out.println("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.println("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.println("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus dibayarkan: Rp. " + totalHarga);
            sc.nextLine();
        }while(true);

        System.out.println("semua transaksi selesai.");

    }
}
