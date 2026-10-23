import java.util.Scanner;

public class penjualanTiket23 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        double diskon, totalBayar, totalPenjualan = 0;

        while (true) {
            System.out.print("Jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket == 0) {
                break;
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid");
                continue;
            }

            totalBayar = jumlahTiket * hargaTiket;
            diskon = 0;

            if (jumlahTiket > 11) {
                diskon = 18;
            } else if (jumlahTiket > 5) {
                diskon = 11;
            }

            totalBayar = totalBayar - (totalBayar * diskon / 100);
            totalTiket = totalTiket+jumlahTiket;
            totalPenjualan = totalPenjualan+totalBayar;

            System.out.println("Diskon: " + diskon + "%");
            System.out.println("Total bayar: Rp" + totalBayar);
        }

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp" + totalPenjualan);

        
    }
}

    
    

