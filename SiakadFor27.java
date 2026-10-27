import java.util.Scanner;
public class SiakadFor27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilai, tertinggi=0, terendah =100;
        int lulus = 0, gagal = 0;

        for (int i = 1; i<=3; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-"+i+": ");
            nilai = sc.nextDouble();
            if(nilai>tertinggi) {
                tertinggi = nilai;
            
            } if (nilai<terendah) {
                terendah = nilai;
            } 
            if (nilai>=60){
                lulus += 1;
            } else {
                gagal += 1;
            }
        }
        System.out.println("Nilai tertinggi: "+tertinggi);
        System.out.println("Nilai terendah: "+terendah);
        System.out.println("Jumlah anak lulus: "+lulus);
        System.out.println("Jumlah anak gagal: "+gagal);
        sc.close();
    }
}
