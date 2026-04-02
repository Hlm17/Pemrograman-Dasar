import java.util.Scanner;

public class Toko {
  public static void main(String[] args) {
    Scanner toko = new Scanner(System.in);
    double totalHarga = 0;
    double hargaAkhir = 0;
    System.out.println("Selamat datang di aplikasi pencatatan toko!\nMasukkan nama barang yang dibeli:");

    // input nama barang
    String namaBarang = toko.nextLine();

    System.out.println("Masukkan harga barang:");
    // input harga barang
    double hargaBarang = toko.nextDouble();

    System.out.println("Masukkan jumlah barang:");
    // input jumlah barang
    int jumlahBarang = toko.nextInt();

    totalHarga = hargaBarang * jumlahBarang;

    System.out.println("Total harga untuk " + jumlahBarang + " " + namaBarang + " adalah: " + totalHarga);

    System.out.println("Masukkan total bayar pelanggan:");
    // total total bayar
    double totalBayar = toko.nextDouble();

    hargaAkhir = totalBayar - totalHarga;
    
    // Output input by user
    System.out.println("Nama Barang: " + namaBarang);
    System.out.println("Harga Barang: " + hargaBarang);
    System.out.println("Jumlah Barang: " + jumlahBarang);
    System.out.println("Total Bayar: " + totalBayar);
    
    if (hargaAkhir>0) {
      System.out.println("Kembalian pelanggan adalah: " + hargaAkhir);
    } 
    else {
      System.out.println("Uang yang dibayarkan kurang. Kekurangan: " + (-hargaAkhir));
    }
    if (hargaAkhir==0) {
      System.out.println("Uang yang dibayarkan pas.");
    }
    
    System.out.println("Terima kasih telah menggunakan aplikasi pencatatan toko!");

// Identifikasilah variabel apa saja yang dibutuhkan untuk membuat program tersebut
    // Saya menggunakan variabel namaBarang, hargaBarang, jumlahBarang, totalHarga, totalBayar, dan hargaAkhir untuk menyimpan informasi yang diperlukan dalam program pencatatan toko ini.
// Tentukanlah tipe data yang sesuai dengan kebutuhan variabelnya
    // Saya menggunakan tipe data String untuk variabel namaBarang karena menyimpan teks, tipe data double untuk hargaBarang, totalHarga, totalBayar, dan hargaAkhir karena menyimpan angka desimal, dan tipe data int untuk jumlahBarang karena menyimpan angka bulat.
// Rancanglah alur input/output dari kebutuhan toko (penjualan)
    // Seperti di kode file ini
    toko.close();
  }
}