import java.util.Scanner;
public class Tugas2Jobsheet7 {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total=0;

        do{
            System.out.print("Masukkan jenis kendaraan (1: Mobil, 2: Motor, 0: Keluar): ");
            jenis = sc.nextInt();

            if(jenis==1 || jenis==2){
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                durasi = sc.nextInt();
                if (jenis==1){
                    total += durasi*3000;
                    System.out.println("Biaya parkir: "+ (durasi*3000));
                } else {
                    total += durasi*2000;
                    System.out.println("Biaya parkir: "+ (durasi*2000));
                }
            }


        } while (jenis!=0);
        
        System.out.println("Total pembayaran parkir: "+total);
        sc.close();

    }
}