import java.util.Scanner;
public class Jobsheet7Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, jumlahTiket, i = 1, totalTiket = 0;
        double diskon, totalHarga = 0;

        do{
            System.out.print("Masukkan jumlah tiket pelanggan "+i+"  (ketik '0' untuk keluar): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket==0) {
                System.out.println("Total tiket terjual: "+totalTiket);
                System.out.println("Total harga tiket terjual: "+totalHarga);
                break;
            }

            if (jumlahTiket<0){
                System.out.println("Jumlah tiket tidak valid");
                continue;
            } 

            if (jumlahTiket>10){
                diskon = (jumlahTiket*hargaTiket)*0.15;
                totalHarga += (jumlahTiket*hargaTiket)-diskon;
                totalTiket += jumlahTiket;
            } else if (jumlahTiket>4){
                diskon = (jumlahTiket*hargaTiket)*0.1;
                totalHarga += (jumlahTiket*hargaTiket)-diskon;
                totalTiket += jumlahTiket;
            } else if (jumlahTiket<=4 && jumlahTiket>0){
                totalHarga += (jumlahTiket*hargaTiket);
                totalTiket += jumlahTiket;
            }
            i++;
        } while(true);
        sc.close();

        
    }
    
}