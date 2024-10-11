import java.util.Scanner;

public class Tugas1713{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlTiket,totalHarga;
        int harga = 50000;
        int i = 1;
        double hrgDiskon = 0;
        int pndptnHarian = 0;

        System.out.println("masukkan jumlah beli tiket anda(quit)untuk keluar program: ");
        do {
            System.out.print("Jumlah tiket pelanggan ke- " + i + " : ");
            jmlTiket = sc.nextInt();

            if (jmlTiket < 0) {
                System.out.println("nilai tidak valid! moohon input ulang");
            }else if(jmlTiket == 0){
                continue;
            }
    totalHarga =  jmlTiket * harga;
    System.out.println("total harga yang harus dibayar: " + totalHarga);

            if (jmlTiket > 4 && jmlTiket <= 10) {
                hrgDiskon = totalHarga - (totalHarga * 0.1);
                System.out.println("diskon : 10%");
                System.out.println("harga setelah diskon : " + hrgDiskon);
            }else if(jmlTiket > 10){
                hrgDiskon = totalHarga - (0.15 *totalHarga );
                System.out.println("diskon: 15%");
                System.out.println("harga setelah diskon: " + hrgDiskon);
            }else{
                hrgDiskon = totalHarga;
            }
            pndptnHarian += hrgDiskon;
            i++;
        } while (jmlTiket != 0);
        System.out.println("pendapatan harian : Rp. " + pndptnHarian);
    }
}