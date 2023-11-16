import java.util.Scanner;
import java.lang.Math;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== Calculator ===");
        System.out.println("1. Akar kuadrat");
        System.out.println("2. Pangkat");
        System.out.println("3. Logaritma ");
        System.out.println("4. Faktorial");
        System.out.println("5. Keluar");
        System.out.print("Pilih operasi (1/2/3/4/5): ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan angka : ");
                int angka = input.nextInt();
                double hasil = Math.sqrt(angka); //menggunakan Math.sqrt()
                System.out.println("Akar kuadrat dari " + angka + " adalah " + hasil);
                break;
            case 2:
                System.out.print("Masukkan angka: ");
                angka = input.nextInt();
                System.out.print("Masukkan pangkat: ");
                int pangkat = input.nextInt();
                hasil = Math.pow(angka, pangkat);//menggunakan  Math.pow()
                System.out.println(angka + " pangkat " + pangkat + " adalah " + hasil);
                break;
            case 3:
                System.out.print("Masukkan angka : ");
                angka = input.nextInt();
                hasil = Math.log(angka); //menggunakan  Math.log()
                System.out.println("Logaritma natural dari " + angka + " adalah " + hasil);
                break;
            case 4:
                System.out.print("Masukkan angka : ");
                angka = input.nextInt();
                hasil = faktorial(angka); // menggunakan method faktorial() ;
                System.out.println("Faktorial dari " + angka + " adalah " + (int) hasil);
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                input.close();
                break;
            default:
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                break;
        }

    }

    public static int faktorial(int angka) {
        if (angka == 0 || angka == 1) {
            return 1;
        } else {
            return angka * faktorial(angka - 1);
        }
    }
}
