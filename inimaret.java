import java.util.Scanner;
public class inimaret {
    public static void main(String[] args) {
        String nama = "";
        String alamat = "";
        String noTelp = "";
        String input = "";
        String statusMember = "";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Apakah pelanggan ingin mendaftarkan member? (y/n): ");
        input = scanner.nextLine();

        if (input.equalsIgnoreCase("Y")) {
            statusMember = "Member";
            System.out.println("Masukkan nama pelanggan: ");
            nama = scanner.nextLine();
            System.out.println("Masukkan alamat pelanggan: ");
            alamat = scanner.nextLine();
            System.out.println("Masukkan nomor telepon pelanggan: ");
            noTelp = scanner.nextLine();
        } else if (input.equalsIgnoreCase("N")) {
            statusMember = "Bukan Member";
            System.out.println("Pelanggan tidak mendaftarkan member.");
        }
        
        System.out.println("Masukkan nama barang belanjaan: ");
        String namaBarang = "";
        namaBarang = scanner.nextLine();

        System.out.println("Masukkan jumlah barang: ");
        int jumlahBarang = scanner.nextInt();
        System.out.println("Masukkan harga barang: ");
        double hargaBarang = scanner.nextDouble();
        double totalHarga = jumlahBarang * hargaBarang;
        double diskon = 0;

        if (statusMember.equals("Member")) {
            System.out.println("Selamat karena status member Aktif dengan data: ");
            System.out.println("Nama Pelanggan: " + nama);
            System.out.println("Alamat Pelanggan: " + alamat);
            System.out.println("Nomor Telepon Pelanggan: " + noTelp);
            System.out.println("Anda mendapatkan diskon tambahan 2%.");
            diskon = totalHarga * 0.02;
        }
        
        if (totalHarga>300000) {
            System.out.println("Selamat! Anda mendapatkan diskon 10% karena melakukan pembelian di atas Rp 300.000.");
            diskon = diskon + (totalHarga * 0.1);
            totalHarga = totalHarga - diskon;
        } else if (totalHarga>100000) {
            System.out.println("Selamat! Anda mendapatkan diskon 5% karena melakukan pembelian di atas Rp 100.000.");
            diskon = diskon + (totalHarga * 0.05);
            totalHarga = totalHarga - diskon;
        }

        System.out.println("Anda mendapatkan Diskon = " + diskon);
        System.out.println("Total harga belanjaan: " + totalHarga);
        scanner.close();
    }
}