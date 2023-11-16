import java.util.Scanner;

public class TextAnalyzer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = ""; // variabel untuk menyimpan teks yang dimasukkan
        int pilihan = 0; // variabel untuk menyimpan pilihan menu
        boolean exit = false; // variabel untuk mengontrol perulangan menu

        while (!exit) {
            // menampilkan menu
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt(); // membaca pilihan menu dari pengguna
            input.nextLine(); // membersihkan buffer

            switch (pilihan) {
                case 1:

                    System.out.print("Masukkan teks: ");
                    text = input.nextLine();
                    System.out.println("Teks telah dimasukkan!");
                    break;
                case 2:
                    // menampilkan jumlah karakter dalam teks
                    System.out.println("Jumlah karakter dalam teks: " + text.length());
                    break;
                case 3:
                    // menampilkan jumlah kata dalam teks
                    System.out.println("Jumlah kata dalam teks: " + HitungKata(text));
                    break;
                case 4:
                    // meminta pengguna untuk memasukkan kata yang ingin dicari
                    System.out.print("Masukkan kata yang ingin dicari: ");
                    String word = input.nextLine(); // membaca kata dari pengguna
                    // menampilkan jumlah kemunculan kata dalam teks
                    System.out.println("Kata '" + word + "' ditemukan sebanyak " + HitungKemunculan(text, word) + " kali dalam teks.");
                    break;
                case 5:
                    // mengakhiri program
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    exit = true; // mengubah variabel exit menjadi true untuk keluar dari perulangan
                    break;
                default:
                    // menampilkan pesan jika pilihan menu tidak valid
                    System.out.println("Pilihan menu tidak valid. Silakan coba lagi.");
            }
        }
    }

    // method untuk menghitung jumlah kata dalam teks
    public static int HitungKata(String text) {
        // jika teks kosong, maka jumlah kata adalah 0
        if (text.isEmpty()) {
            return 0;
        }
        // jika teks tidak kosong, maka pisahkan teks berdasarkan spasi dan simpan dalam array
        String[] words = text.split(" ");
        // kembalikan panjang array sebagai jumlah kata
        return words.length;
    }

    // method untuk menghitung jumlah kemunculan kata dalam teks
    public static int HitungKemunculan(String text, String word) {
        // jika teks atau kata kosong, maka jumlah kemunculan adalah 0
        if (text.isEmpty() || word.isEmpty()) {
            return 0;
        }
        // jika teks dan kata tidak kosong, maka pisahkan teks berdasarkan spasi dan simpan dalam array
        String[] words = text.split(" ");
        // inisialisasi variabel untuk menyimpan jumlah kemunculan
        int count = 0;
        // ulangi untuk setiap kata dalam array
        for (String w : words) {
            // jika kata dalam array sama dengan kata yang dicari (tidak memperhatikan huruf besar/kecil), maka tambahkan jumlah kemunculan
            if (w.equalsIgnoreCase(word)) {
                count++;
            }
        }
        // kembalikan jumlah kemunculan
        return count;
    }
}
